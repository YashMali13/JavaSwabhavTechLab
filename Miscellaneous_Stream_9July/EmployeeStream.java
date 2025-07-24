package Miscellaneous;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeStream {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Number's of empList : ");
	int noOfEmp= scanner.nextInt();
	
	List<Employee> empList= new ArrayList<Employee>();	
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	for ( int i=0; i<noOfEmp;i++){
		System.out.println("Employee Name : ");
		String name = scanner.nextLine();
		scanner.nextLine();
		
		System.out.println("Employee Salary : ");
		double salary = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Employee Joining Date : ");
//		LocalDate joiningDate = scanner.next();
		LocalDate joiningDate = LocalDate.parse(scanner.nextLine(),format);
		scanner.nextLine();
		
		System.out.println("Employee Gender(M/F) : ");
		String gender = scanner.nextLine();
		scanner.nextLine();
		
		empList.add(new Employee(name, salary, joiningDate, gender));
	}

//	1. Find the employee who has maximum salary.
	empList.stream().max(Comparator.comparingDouble(Employee::getSalary))
    .ifPresent(e -> System.out.println("\n Employee with Max Salary: " + e));

//	2. Find the employee who has second highest salary.
	empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
	.skip(1).findFirst().ifPresent(e-> System.out.println("\n Employee with Second Max Salary: " + e));


//	3. Find the employee who is most senior based on joining date.
	empList.stream().min(Comparator.comparing(Employee::getJoiningDate))
    .ifPresent(e -> System.out.println("\n Most Senior Employee: " + e));

	
//	4. count the employee based on gender.
	Map<String, Long> genderCount = empList.stream()
	.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
	System.out.println("\n Gender-wise Employee Count:");
	genderCount.forEach((k, v) -> System.out.println(k + ": " + v));
	
}
		
	
}
