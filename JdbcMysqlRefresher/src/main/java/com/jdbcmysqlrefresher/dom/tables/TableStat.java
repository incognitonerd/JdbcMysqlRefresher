package com.jdbcmysqlrefresher.dom.tables;
public class TableStat {
	private int id;
	private String tableName;
	private int numOfRows;
	
	public TableStat(int id, String tableName, int numOfRows){
		this.id = id;
		this.tableName = tableName;
		this.numOfRows = numOfRows;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getTableName(){
		return tableName;
	}
	
	public void setTableName(String tableName){
		this.tableName = tableName;
	}
	
	public int getNumOfRows(){
		return numOfRows;
	}
	
	public void setNumOfRows(int numOfRows){
		this.numOfRows = numOfRows;
	}
}
