package com.jdbcmysqlrefresher.dom.tables;
public class AvailableEndpoint {
	private int id;
	private String endpointUrl;
	private String endpointQuery;
	
	public AvailableEndpoint(int id, String endpointUrl, String endpointQuery){
		this.id = id;
		this.endpointUrl = endpointUrl;
		this.endpointQuery = endpointQuery;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getEndpointUrl(){
		return endpointUrl;
	}
	
	public void setEndpointUrl(String endpointUrl){
		this.endpointUrl = endpointUrl;
	}
	
	public String getEndpointQuery(){
		return endpointQuery;
	}
	
	public void setEndpointQuery(String endpointQuery){
		this.endpointQuery = endpointQuery;
	}
}
