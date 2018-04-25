package com.jdbcmysqlrefresher.dom.tables;
import java.sql.Timestamp;

public class Like {
	private int user_id;
	private int photo_id;
	private java.sql.Timestamp created_at;
	
	public Like(int user_id, int photo_id, Timestamp created_at){
		this.user_id = user_id;
		this.photo_id = photo_id;
		this.created_at = created_at;
	}
	
	public int getUser_id(){
		return user_id;
	}
	
	public void setUser_id(int user_id){
		this.user_id = user_id;
	}
	
	public int getPhoto_id(){
		return photo_id;
	}
	
	public void setPhoto_id(int photo_id){
		this.photo_id = photo_id;
	}
	
	public java.sql.Timestamp getCreated_at(){
		return created_at;
	}
	
	public void setCreated_at(java.sql.Timestamp created_at){
		this.created_at = created_at;
	}
}
