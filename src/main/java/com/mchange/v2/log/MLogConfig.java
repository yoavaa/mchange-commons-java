/*
 * Distributed as part of mchange-commons-java 0.2.6
 *
 * Copyright (C) 2013 Machinery For Change, Inc.
 *
 * Author: Steve Waldman <swaldman@mchange.com>
 *
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of EITHER:
 *
 *     1) The GNU Lesser General Public License (LGPL), version 2.1, as 
 *        published by the Free Software Foundation
 *
 * OR
 *
 *     2) The Eclipse Public License (EPL), version 1.0
 *
 * You may choose which license to accept if you wish to redistribute
 * or modify this work. You may offer derivatives of this work
 * under the license you have chosen, or you may provide the same
 * choice of license which you have been offered here.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * You should have received copies of both LGPL v2.1 and EPL v1.0
 * along with this software; see the files LICENSE-EPL and LICENSE-LGPL.
 * If not, the text of these licenses are currently available at
 *
 * LGPL v2.1: http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 *  EPL v1.0: http://www.eclipse.org/org/documents/epl-v10.php 
 * 
 */

package com.mchange.v2.log;


import java.util.*;
import java.lang.reflect.Method;
import com.mchange.v2.cfg.MLogConfigSource;
import com.mchange.v2.cfg.MultiPropertiesConfig;

public final class MLogConfig
{
    private final static MultiPropertiesConfig CONFIG;
    private final static List                  BOOTSTRAP_LOG_ITEMS;

    //MT protected by class' lock
    private static Method delayedDumpToLogger = null;

    static
    {
	String[] defaults = new String[] { "/com/mchange/v2/log/default-mchange-log.properties"  };
	String[] preempts = new String[] { "/mchange-log.properties", "/" };

	List bli = new ArrayList();
	CONFIG = MLogConfigSource.readVmConfig( defaults, preempts, bli );
	BOOTSTRAP_LOG_ITEMS = Collections.unmodifiableList( bli );
    }

    synchronized static void ensureDelayedDumpToLogger()
    {
	try
	{
	    if ( delayedDumpToLogger == null )
	    {
		Class mConfigClass = Class.forName( "com.mchange.v2.cfg.MConfig" );
		Class delayedLogItemClass = Class.forName( "com.mchange.v2.cfg.DelayedLogItem" );
		delayedDumpToLogger = mConfigClass.getMethod("dumpToLogger", new Class[] { delayedLogItemClass, MLogger.class } );
	    }
	}
	catch ( RuntimeException e )
	{ 
	    e.printStackTrace();
	    throw e; 
	}
	catch ( Exception e )
	{ 
	    e.printStackTrace();
	    throw new RuntimeException( e ); 
	}
    }

    public static String getProperty( String key )
    { return CONFIG.getProperty( key ); }

    public static void logDelayedItems( MLogger logger )
    { 
	ensureDelayedDumpToLogger();

	List items = new ArrayList();
	items.addAll( BOOTSTRAP_LOG_ITEMS );
	items.addAll( CONFIG.getDelayedLogItems() );

	Set uniquerizer = new HashSet();
	uniquerizer.addAll( items );
	
	for( Iterator ii = items.iterator(); ii.hasNext(); )
	{
	    Object item = ii.next();

	    if (uniquerizer.contains( item ) )
	    {
		uniquerizer.remove( item );

		try { delayedDumpToLogger.invoke( null, new Object[] { item, logger } ); }
		catch ( Exception e )
		    {
			// bad, bad, shouldn't happen
			e.printStackTrace();
			throw new Error(e);
		    }
	    }
	}
    }

    public static String dump()
    { return CONFIG.toString(); }

    private MLogConfig()
    {}
}
