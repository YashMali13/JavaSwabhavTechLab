package Ques_02;

public class Flight {

	private String airline;
	private double fare ; 
	
//	public Flight(String airline, double fare ) {
//		this.airline=airline;
//		this.fare=fare;
//	}

	
	public Flight(String airline, int fare) {
		this.airline=airline;
		this.fare=fare;
	}


	public String getAirline() {
		return airline;
	}

	public double getFare() {
		return fare;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + airline + " - ₹" + fare + "]";
	}
	
}
