package com.jdbcmysqlrefresher.dom.tables;
import java.sql.Timestamp;

public class Tag {
	private int id;
	private String tag_name;
	private java.sql.Timestamp created_at;
	
	public Tag(int id, String tag_name, Timestamp created_at){
		this.id = id;
		this.tag_name = tag_name;
		this.created_at = created_at;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getTag_name(){
		return tag_name;
	}
	
	public void setTag_name(String tag_name){
		this.tag_name = tag_name;
	}
	
	public java.sql.Timestamp getCreated_at(){
		return created_at;
	}
	
	public void setCreated_at(java.sql.Timestamp created_at){
		this.created_at = created_at;
	}
}
