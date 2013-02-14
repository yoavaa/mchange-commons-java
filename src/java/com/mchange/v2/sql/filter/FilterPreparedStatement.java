/*
 * This class generated by com.mchange.v2.codegen.intfc.DelegatorGenerator
 * Thu Feb 14 15:42:33 PST 2013
 * DO NOT HAND EDIT!!!!
 */
package com.mchange.v2.sql.filter;

import java.io.InputStream;
import java.io.Reader;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;

/**
 * This class was generated by com.mchange.v2.codegen.intfc.DelegatorGenerator.
 */
public abstract class FilterPreparedStatement implements PreparedStatement
{
	protected PreparedStatement inner;
	
	
	private void __setInner( PreparedStatement inner )
	{
		this.inner = inner;
	}
	
	public FilterPreparedStatement(PreparedStatement inner)
	{ __setInner( inner ); }
	
	public FilterPreparedStatement()
	{}
	
	public void setInner( PreparedStatement inner )
	{ __setInner( inner ); }
	
	public PreparedStatement getInner()
	{ return inner; }
	
	public void setBoolean(int a, boolean b) throws SQLException
	{
		inner.setBoolean(a, b);
	}
	
	public void setByte(int a, byte b) throws SQLException
	{
		inner.setByte(a, b);
	}
	
	public void setShort(int a, short b) throws SQLException
	{
		inner.setShort(a, b);
	}
	
	public void setInt(int a, int b) throws SQLException
	{
		inner.setInt(a, b);
	}
	
	public void setLong(int a, long b) throws SQLException
	{
		inner.setLong(a, b);
	}
	
	public void setFloat(int a, float b) throws SQLException
	{
		inner.setFloat(a, b);
	}
	
	public void setDouble(int a, double b) throws SQLException
	{
		inner.setDouble(a, b);
	}
	
	public void setTimestamp(int a, Timestamp b, Calendar c) throws SQLException
	{
		inner.setTimestamp(a, b, c);
	}
	
	public void setTimestamp(int a, Timestamp b) throws SQLException
	{
		inner.setTimestamp(a, b);
	}
	
	public void setURL(int a, URL b) throws SQLException
	{
		inner.setURL(a, b);
	}
	
	public void setTime(int a, Time b, Calendar c) throws SQLException
	{
		inner.setTime(a, b, c);
	}
	
	public void setTime(int a, Time b) throws SQLException
	{
		inner.setTime(a, b);
	}
	
	public void setDate(int a, Date b, Calendar c) throws SQLException
	{
		inner.setDate(a, b, c);
	}
	
	public void setDate(int a, Date b) throws SQLException
	{
		inner.setDate(a, b);
	}
	
	public boolean execute() throws SQLException
	{
		return inner.execute();
	}
	
	public ResultSetMetaData getMetaData() throws SQLException
	{
		return inner.getMetaData();
	}
	
	public ResultSet executeQuery() throws SQLException
	{
		return inner.executeQuery();
	}
	
	public int executeUpdate() throws SQLException
	{
		return inner.executeUpdate();
	}
	
	public void addBatch() throws SQLException
	{
		inner.addBatch();
	}
	
	public void setNull(int a, int b, String c) throws SQLException
	{
		inner.setNull(a, b, c);
	}
	
	public void setNull(int a, int b) throws SQLException
	{
		inner.setNull(a, b);
	}
	
	public void setBigDecimal(int a, BigDecimal b) throws SQLException
	{
		inner.setBigDecimal(a, b);
	}
	
	public void setString(int a, String b) throws SQLException
	{
		inner.setString(a, b);
	}
	
	public void setBytes(int a, byte[] b) throws SQLException
	{
		inner.setBytes(a, b);
	}
	
	public void setAsciiStream(int a, InputStream b) throws SQLException
	{
		inner.setAsciiStream(a, b);
	}
	
	public void setAsciiStream(int a, InputStream b, long c) throws SQLException
	{
		inner.setAsciiStream(a, b, c);
	}
	
	public void setAsciiStream(int a, InputStream b, int c) throws SQLException
	{
		inner.setAsciiStream(a, b, c);
	}
	
	public void setUnicodeStream(int a, InputStream b, int c) throws SQLException
	{
		inner.setUnicodeStream(a, b, c);
	}
	
	public void setBinaryStream(int a, InputStream b, int c) throws SQLException
	{
		inner.setBinaryStream(a, b, c);
	}
	
	public void setBinaryStream(int a, InputStream b) throws SQLException
	{
		inner.setBinaryStream(a, b);
	}
	
	public void setBinaryStream(int a, InputStream b, long c) throws SQLException
	{
		inner.setBinaryStream(a, b, c);
	}
	
	public void clearParameters() throws SQLException
	{
		inner.clearParameters();
	}
	
	public void setObject(int a, Object b) throws SQLException
	{
		inner.setObject(a, b);
	}
	
	public void setObject(int a, Object b, int c) throws SQLException
	{
		inner.setObject(a, b, c);
	}
	
	public void setObject(int a, Object b, int c, int d) throws SQLException
	{
		inner.setObject(a, b, c, d);
	}
	
	public void setCharacterStream(int a, Reader b) throws SQLException
	{
		inner.setCharacterStream(a, b);
	}
	
	public void setCharacterStream(int a, Reader b, long c) throws SQLException
	{
		inner.setCharacterStream(a, b, c);
	}
	
	public void setCharacterStream(int a, Reader b, int c) throws SQLException
	{
		inner.setCharacterStream(a, b, c);
	}
	
	public void setRef(int a, Ref b) throws SQLException
	{
		inner.setRef(a, b);
	}
	
	public void setBlob(int a, InputStream b, long c) throws SQLException
	{
		inner.setBlob(a, b, c);
	}
	
	public void setBlob(int a, InputStream b) throws SQLException
	{
		inner.setBlob(a, b);
	}
	
	public void setBlob(int a, Blob b) throws SQLException
	{
		inner.setBlob(a, b);
	}
	
	public void setClob(int a, Reader b, long c) throws SQLException
	{
		inner.setClob(a, b, c);
	}
	
	public void setClob(int a, Reader b) throws SQLException
	{
		inner.setClob(a, b);
	}
	
	public void setClob(int a, Clob b) throws SQLException
	{
		inner.setClob(a, b);
	}
	
	public void setArray(int a, Array b) throws SQLException
	{
		inner.setArray(a, b);
	}
	
	public ParameterMetaData getParameterMetaData() throws SQLException
	{
		return inner.getParameterMetaData();
	}
	
	public void setRowId(int a, RowId b) throws SQLException
	{
		inner.setRowId(a, b);
	}
	
	public void setNString(int a, String b) throws SQLException
	{
		inner.setNString(a, b);
	}
	
	public void setNCharacterStream(int a, Reader b, long c) throws SQLException
	{
		inner.setNCharacterStream(a, b, c);
	}
	
	public void setNCharacterStream(int a, Reader b) throws SQLException
	{
		inner.setNCharacterStream(a, b);
	}
	
	public void setNClob(int a, NClob b) throws SQLException
	{
		inner.setNClob(a, b);
	}
	
	public void setNClob(int a, Reader b, long c) throws SQLException
	{
		inner.setNClob(a, b, c);
	}
	
	public void setNClob(int a, Reader b) throws SQLException
	{
		inner.setNClob(a, b);
	}
	
	public void setSQLXML(int a, SQLXML b) throws SQLException
	{
		inner.setSQLXML(a, b);
	}
	
	public void close() throws SQLException
	{
		inner.close();
	}
	
	public boolean isClosed() throws SQLException
	{
		return inner.isClosed();
	}
	
	public boolean execute(String a, int b) throws SQLException
	{
		return inner.execute(a, b);
	}
	
	public boolean execute(String a) throws SQLException
	{
		return inner.execute(a);
	}
	
	public boolean execute(String a, String[] b) throws SQLException
	{
		return inner.execute(a, b);
	}
	
	public boolean execute(String a, int[] b) throws SQLException
	{
		return inner.execute(a, b);
	}
	
	public SQLWarning getWarnings() throws SQLException
	{
		return inner.getWarnings();
	}
	
	public void clearWarnings() throws SQLException
	{
		inner.clearWarnings();
	}
	
	public void setFetchDirection(int a) throws SQLException
	{
		inner.setFetchDirection(a);
	}
	
	public int getFetchDirection() throws SQLException
	{
		return inner.getFetchDirection();
	}
	
	public void setFetchSize(int a) throws SQLException
	{
		inner.setFetchSize(a);
	}
	
	public int getFetchSize() throws SQLException
	{
		return inner.getFetchSize();
	}
	
	public Connection getConnection() throws SQLException
	{
		return inner.getConnection();
	}
	
	public int getResultSetHoldability() throws SQLException
	{
		return inner.getResultSetHoldability();
	}
	
	public ResultSet executeQuery(String a) throws SQLException
	{
		return inner.executeQuery(a);
	}
	
	public int executeUpdate(String a, String[] b) throws SQLException
	{
		return inner.executeUpdate(a, b);
	}
	
	public int executeUpdate(String a) throws SQLException
	{
		return inner.executeUpdate(a);
	}
	
	public int executeUpdate(String a, int b) throws SQLException
	{
		return inner.executeUpdate(a, b);
	}
	
	public int executeUpdate(String a, int[] b) throws SQLException
	{
		return inner.executeUpdate(a, b);
	}
	
	public int getMaxFieldSize() throws SQLException
	{
		return inner.getMaxFieldSize();
	}
	
	public void setMaxFieldSize(int a) throws SQLException
	{
		inner.setMaxFieldSize(a);
	}
	
	public int getMaxRows() throws SQLException
	{
		return inner.getMaxRows();
	}
	
	public void setMaxRows(int a) throws SQLException
	{
		inner.setMaxRows(a);
	}
	
	public void setEscapeProcessing(boolean a) throws SQLException
	{
		inner.setEscapeProcessing(a);
	}
	
	public int getQueryTimeout() throws SQLException
	{
		return inner.getQueryTimeout();
	}
	
	public void setQueryTimeout(int a) throws SQLException
	{
		inner.setQueryTimeout(a);
	}
	
	public void cancel() throws SQLException
	{
		inner.cancel();
	}
	
	public void setCursorName(String a) throws SQLException
	{
		inner.setCursorName(a);
	}
	
	public ResultSet getResultSet() throws SQLException
	{
		return inner.getResultSet();
	}
	
	public int getUpdateCount() throws SQLException
	{
		return inner.getUpdateCount();
	}
	
	public boolean getMoreResults(int a) throws SQLException
	{
		return inner.getMoreResults(a);
	}
	
	public boolean getMoreResults() throws SQLException
	{
		return inner.getMoreResults();
	}
	
	public int getResultSetConcurrency() throws SQLException
	{
		return inner.getResultSetConcurrency();
	}
	
	public int getResultSetType() throws SQLException
	{
		return inner.getResultSetType();
	}
	
	public void addBatch(String a) throws SQLException
	{
		inner.addBatch(a);
	}
	
	public void clearBatch() throws SQLException
	{
		inner.clearBatch();
	}
	
	public int[] executeBatch() throws SQLException
	{
		return inner.executeBatch();
	}
	
	public ResultSet getGeneratedKeys() throws SQLException
	{
		return inner.getGeneratedKeys();
	}
	
	public void setPoolable(boolean a) throws SQLException
	{
		inner.setPoolable(a);
	}
	
	public boolean isPoolable() throws SQLException
	{
		return inner.isPoolable();
	}
	
	public Object unwrap(Class a) throws SQLException
	{
		return inner.unwrap(a);
	}
	
	public boolean isWrapperFor(Class a) throws SQLException
	{
		return inner.isWrapperFor(a);
	}
	
}
