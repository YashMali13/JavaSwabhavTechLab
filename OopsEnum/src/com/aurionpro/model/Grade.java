package com.aurionpro.model;



public enum Grade {
A(" Excellent"),
B(" Good"),
C(" Avg"),
D(" Below Avg"),
F(" Fail");
	
	private String discription;
	Grade(String discription){
		this.discription=discription;
	}
	
	public String getDiscription(){
		return discription;	
	}

}
