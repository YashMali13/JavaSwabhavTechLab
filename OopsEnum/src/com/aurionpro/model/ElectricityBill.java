package com.aurionpro.model;

public class ElectricityBill {
	private int apartmentNumber ;
	private int unitConsumeed;
	static double costParUnit ;
	
	public  ElectricityBill(int apartmentNumber ,int unitConsumeed ,double costParUnit ) {
		this.apartmentNumber=apartmentNumber;
		this.unitConsumeed=unitConsumeed;
		this.costParUnit=costParUnit;
	}
	
	public void displyBill() {
		System.out.println("Apartment Number : "+apartmentNumber );
		System.out.println("Unit Consumeed: "+unitConsumeed );
		System.out.println("Bill Amount : "+calculateBill(unitConsumeed, costParUnit));	
	}
	
	public double calculateBill(int unitConsumeed , double costParUnit ) {
		return (unitConsumeed*costParUnit) ;
	}
	
//	public static void setCostPerUnit() {
//		
//	}
//	
//	public static void displyCurrentRate() {
//		
//	}
		
	
	
}
