package com.aurionpro.model;

public enum TicketType {
	REGULAR ("REGULAR Rs500/-"),
	VIP ("VIP Rs1000/-"),
	PRIMIUM ("PRIMIUM Rs1500/-");
	
	private String ticketType;
	private TicketType (String ticketType) {
		this.ticketType=ticketType;
	}
	public String getTicketType() {
		return ticketType;
	}
	
//	REGULAR ,
//	VIP ,
//	PRIMIUM ,
	
}
