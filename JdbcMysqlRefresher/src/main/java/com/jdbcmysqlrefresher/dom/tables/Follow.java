package com.jdbcmysqlrefresher.dom.tables;
import java.sql.Timestamp;

public class Follow {
	private int follower_id;
	private int followee_id;
	private java.sql.Timestamp created_at;
	
	public Follow(int follower_id, int followee_id, Timestamp created_at){
		super();
		this.follower_id = follower_id;
		this.followee_id = followee_id;
		this.created_at = created_at;
	}
	
	public int getFollower_id(){
		return follower_id;
	}
	
	public void setFollower_id(int follower_id){
		this.follower_id = follower_id;
	}
	
	public int getFollowee_id(){
		return followee_id;
	}
	
	public void setFollowee_id(int followee_id){
		this.followee_id = followee_id;
	}
	
	public java.sql.Timestamp getCreated_at(){
		return created_at;
	}
	
	public void setCreated_at(java.sql.Timestamp created_at){
		this.created_at = created_at;
	}
}
