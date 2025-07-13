package com.aurionpro.model;

public enum PaymentStatus {
SUCCESS ("Payment Successfull . ") ,
PENDING ("Payment is Pending State . "),
FAILED ("Your Payment is Failed . "),
CANCELLED ("Your Payment is Cancelled . ");
	
	private String status ;
	private PaymentStatus(String status){
		this.status=status;
	}
	public String getPaymentStatus (){
		return status;
	}
}
