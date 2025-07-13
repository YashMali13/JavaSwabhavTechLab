package Miscellaneous;

import java.time.LocalDate;

public class Employee {

		private String name;
	    private double salary;
	    private LocalDate joiningDate;
	    private String gender;
	    
	    public Employee(String name , double salary, LocalDate joinDate, String gender) {
	    	this.name= name ;
	    	this.gender = gender;
	    	this .joiningDate=joinDate;
	    	this.salary= salary;	
	    }
	    
	    public String getName() {
			return name;
		}

		public double getSalary() {
			return salary;
		}

		public LocalDate getJoiningDate() {
			return joiningDate;
		}

		public String getGender() {
			return gender;
		}
	    
		@Override
		public String toString() {
			return "Employee [name=" + name + ", salary=" + salary + ", joiningDate=" + joiningDate + ", gender="
					+ gender + "]";
		}


		
	    
	    
}
