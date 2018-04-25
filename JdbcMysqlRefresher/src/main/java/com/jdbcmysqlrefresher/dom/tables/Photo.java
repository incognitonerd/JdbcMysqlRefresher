package com.jdbcmysqlrefresher.dom.tables;
import java.sql.Timestamp;

public class Photo {
	private int id;
	private String image_url;
	private int user_id;
	private java.sql.Timestamp created_at;
	
	public Photo(int id, String image_url, int user_id, Timestamp created_at){
		this.id = id;
		this.image_url = image_url;
		this.user_id = user_id;
		this.created_at = created_at;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getImage_url(){
		return image_url;
	}
	
	public void setImage_url(String image_url){
		this.image_url = image_url;
	}
	
	public int getUser_id(){
		return user_id;
	}
	
	public void setUser_id(int user_id){
		this.user_id = user_id;
	}
	
	public java.sql.Timestamp getCreated_at(){
		return created_at;
	}
	
	public void setCreated_at(java.sql.Timestamp created_at){
		this.created_at = created_at;
	}
}
