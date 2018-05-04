package com.jdbcmysqlrefresher.dto;

public class FiveMostPopHashtagsDTO {
	private String tagName;
	private int totalUses;
	public FiveMostPopHashtagsDTO(String tagName, int totalUses){
		this.tagName = tagName;
		this.totalUses = totalUses;
	}
	public String getTagName(){
		return tagName;
	}
	public void setTagName(String tagName){
		this.tagName = tagName;
	}
	public int getTotalUses(){
		return totalUses;
	}
	public void setTotalUses(int totalUses){
		this.totalUses = totalUses;
	}
}
