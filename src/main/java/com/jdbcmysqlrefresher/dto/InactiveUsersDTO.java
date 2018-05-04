package com.jdbcmysqlrefresher.dto;

public class InactiveUsersDTO {
	private String username;

	public InactiveUsersDTO(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	public void setUsername(String username){
		this.username = username;
	}
	
}
