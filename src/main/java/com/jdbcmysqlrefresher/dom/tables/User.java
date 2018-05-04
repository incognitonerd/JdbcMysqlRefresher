package com.jdbcmysqlrefresher.dom.tables;
import java.sql.Timestamp;

public class User {
	private int id;
	private String username;
	private java.sql.Timestamp created_at;
	
	public User(){
	}
	
	public User(int id, String username, Timestamp created_at){
		this.id = id;
		this.username = username;
		this.created_at = created_at;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public java.sql.Timestamp getCreated_at(){
		return created_at;
	}
	
	public void setCreated_at(java.sql.Timestamp created_at){
		this.created_at = created_at;
	}
}
