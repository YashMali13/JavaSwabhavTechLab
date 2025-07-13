package com.aurionpro.text;

import java.util.Scanner;

import com.aurionpro.model.Grade;

public class GradeEvaluation_02 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Grade (A,B,C,D,F)");
	
	String ip= scanner.nextLine().toUpperCase();
	
	Grade grade= Grade.valueOf(ip);
	System.out.println("Grade is : "+ grade.getDiscription());
	
}
}
