package com.jdbcmysqlrefresher.dto;
public class AvgPhotosPerUserDTO {
	private int totalPhotos;
	private int totalUsers;
	private double avgPhotosPerUser;
	
	public AvgPhotosPerUserDTO(int totalPhotos, int totalUsers, double avgPhotosPerUser){
		this.totalPhotos = totalPhotos;
		this.totalUsers = totalUsers;
		this.avgPhotosPerUser = avgPhotosPerUser;
	}
	
	public int getTotalPhotos(){
		return totalPhotos;
	}
	
	public void setTotalPhotos(int totalPhotos){
		this.totalPhotos = totalPhotos;
	}
	
	public int getTotalUsers(){
		return totalUsers;
	}
	
	public void setTotalUsers(int totalUsers){
		this.totalUsers = totalUsers;
	}
	
	public double getAvgPhotosPerUser(){
		return avgPhotosPerUser;
	}
	
	public void setAvgPhotosPerUser(double avgPhotosPerUser){
		this.avgPhotosPerUser = avgPhotosPerUser;
	}
}
