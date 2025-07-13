package StremOperatio;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StremDemon {
	//Given a list of Student objects, sort them by marks in ascending order, and print the sorted list.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter No of Students :");
		int totalStudent = scanner.nextInt();
		
		List<Student> studentList = new ArrayList<Student>();
		
		for (int i=1 ;i<=totalStudent; i++) {
			System.out.print("Enter name : ");
			String name = scanner.nextLine();
			scanner.nextLine();
			
			System.out.print("Enter Roll Number : ");
			int rollNo= scanner.nextInt();
			
			System.out.print("Enter CGPA : ");
			float cgpa = scanner.nextFloat();
			
			//scanner.nextLine();
			studentList.add(new Student(name, rollNo, cgpa));
		}
		
		System.out.println(studentList);
		
		studentList.stream().sorted(Comparator.comparing((Student s)-> s.name).reversed()).forEach(System.out::println);
			 
		 
//		1. Given a list of integers, find the smallest number.
		System.out.print("Smallest CGPA : ");
		studentList.stream().min(Comparator.comparing((Student s)-> s.cgpa)).ifPresent(System.out::print);
		scanner.nextLine();
		
//		2. From a list of strings, find the one with the maximum length.
		System.out.println("Max length of Name: ");
		studentList.stream().min(Comparator.comparing((Student s)-> s.name).thenComparing((Student s1)->s1.name.length())).ifPresent(System.out::println);
		
//		3. Given a list of Student objects, find the student who scored the highest marks.
		System.out.println("student who scored the highest CGPA :");
		studentList.stream().max(Comparator.comparing((Student s)-> s.cgpa)).ifPresent(System.out::println);
		
//		4. Filter even numbers from a list and find the largest even number.
		System.out.println("Largest even number : ");
		studentList.stream().filter((Student s)->s.rollNo%2==0).max(Comparator.comparing((Student s)-> s.rollNo)).ifPresent(System.out::println);
		
		

		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
 
}
