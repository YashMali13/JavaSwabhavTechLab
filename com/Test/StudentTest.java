package com.Test;

import com.model.InterfaceClasses.IStudent;
import com.model.InterfaceClasses.IStudent3;

public class StudentTest {
public static void main(String[] args) {
	
	IStudent student= ()->{ System.out.println("Hiee");};
	student.greet();


	IStudent2 student2 = (String str)->{return str;};
	System.out.println(student2.display("Yash"));
	
	IStudent3 student3 = (a,b)->a+b;
	System.out.println(student3.add(2, 3));
	
}
}
