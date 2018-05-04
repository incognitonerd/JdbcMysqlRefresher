package com.jdbcmysqlrefresher.dto;
public class TwoMostPopRegDatesDTO {
	private String day;
	private int total;
	
	public TwoMostPopRegDatesDTO(String day, int total){
		this.day = day;
		this.total = total;
	}
	
	public String getDay(){
		return day;
	}
	
	public void setDay(String day){
		this.day = day;
	}
	
	public int getTotal(){
		return total;
	}
	
	public void setTotal(int total){
		this.total = total;
	}
}
