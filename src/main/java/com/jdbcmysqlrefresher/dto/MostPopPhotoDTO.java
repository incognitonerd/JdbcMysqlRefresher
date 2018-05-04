package com.jdbcmysqlrefresher.dto;
public class MostPopPhotoDTO {
	private String username;
	private String image_url;
	private int totalLikes;
	
	public MostPopPhotoDTO(String username, String image_url, int totalLikes){
		this.username = username;
		this.image_url = image_url;
		this.setTotalLikes(totalLikes);
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getImage_url(){
		return image_url;
	}
	
	public void setImage_url(String image_url){
		this.image_url = image_url;
	}
	
	public int getTotalLikes(){
		return totalLikes;
	}
	
	public void setTotalLikes(int totalLikes){
		this.totalLikes = totalLikes;
	}
}
