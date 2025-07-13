package com.aurionpro.model;

public enum BookingStatus {
PENDING ("Booking Status : CONFIRM"),	
YES("Booking Status : CONFIRM"),
NO("Booking Status : CANCELLED");
	
	private String status;
	BookingStatus(String status) {
		this.status=status;
	}
	public String getBookingStatus() {
		return status;
	}
	
}

