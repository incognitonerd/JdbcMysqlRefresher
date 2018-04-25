package com.jdbcmysqlrefresher.dom.tables;
public class PhotoTag {
	private int photo_id;
	private int tag_id;
	
	public PhotoTag(int photo_id, int tag_id){
		this.photo_id = photo_id;
		this.tag_id = tag_id;
	}
	
	public int getPhoto_id(){
		return photo_id;
	}
	
	public void setPhoto_id(int photo_id){
		this.photo_id = photo_id;
	}
	
	public int getTag_id(){
		return tag_id;
	}
	
	public void setTag_id(int tag_id){
		this.tag_id = tag_id;
	}
}
