package Ques_03;

public class Movie {
 
	private String name; 
	private int year ;
	
	public Movie(String name , int year) {
		this.name=name;
		this.year= year;
				
	}
	public String getName() {
		return name;
	}
	
	public int getYear() {
		return year;
	}
	@Override
	public String toString() {
		
		return "[" + name + " - " + year + "]";
	}
	
	
	
	
}
