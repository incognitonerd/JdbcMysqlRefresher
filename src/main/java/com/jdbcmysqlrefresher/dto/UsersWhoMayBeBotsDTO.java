package com.jdbcmysqlrefresher.dto;
public class UsersWhoMayBeBotsDTO {
	private String username;
	private int numOfLikes;
	
	public UsersWhoMayBeBotsDTO(String username, int numOfLikes){
		this.setUsername(username);
		this.setNumOfLikes(numOfLikes);
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public int getNumOfLikes(){
		return numOfLikes;
	}
	
	public void setNumOfLikes(int numOfLikes){
		this.numOfLikes = numOfLikes;
	}
}
