package com.jdbcmysqlrefresher.dom.tables;
import java.sql.Timestamp;

public class Comment {
	private int id;
	private String comment_text;
	private int photo_id;
	private int user_id;
	private java.sql.Timestamp created_at;
	
	public Comment(int id, String comment_text, int photo_id, int user_id, Timestamp created_at){
		this.id = id;
		this.comment_text = comment_text;
		this.photo_id = photo_id;
		this.user_id = user_id;
		this.created_at = created_at;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getComment_text(){
		return comment_text;
	}
	
	public void setComment_text(String comment_text){
		this.comment_text = comment_text;
	}
	
	public int getPhoto_id(){
		return photo_id;
	}
	
	public void setPhoto_id(int photo_id){
		this.photo_id = photo_id;
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
