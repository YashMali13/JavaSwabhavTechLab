package com.aurionpro.text;
import java.util.*;

import com.aurionpro.model.BookingStatus;
import com.aurionpro.model.TicketType;
public class TicketBookingSystem_04 {

public static void main(String[] args) {
	System.out.println("===== TICKET BOOKING STSTEM =====");
	Scanner scanner = new Scanner (System.in);
	System.out.print("Enter Your name :");
	String name = scanner.nextLine().toUpperCase();
	scanner.nextLine();
	
	
	System.out.print("Choose Ticket Type :(Regular / VIP /Primium) :");
	String type= scanner.nextLine().toUpperCase();
	TicketType ticketType =  TicketType.valueOf(type);
	
	
	System.out.println("Booking Status : PENDING ");
	System.out.print("Do you wont to confirm the booking ? (Yes/No): ");
	String choice = scanner.nextLine().toUpperCase();
//	if(choice != "Yes "|| choice !="NO") {
//		
//	}
	BookingStatus bookingType =  BookingStatus.valueOf(choice);
	
	
	
	scanner.nextLine(); 
	System.out.println("===== TICKET DETAILS ===== ");
	System.out.println("Costomer Name : "+ name);

	System.out.println("Ticket Type & Amount : "+ticketType.getTicketType());
	System.out.println(bookingType.getBookingStatus());
	System.out.println("==================================");
	System.out.println("Thank You for Booking with Us !! ");
	
		

}
}
