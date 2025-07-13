package EducationExamSystem;
import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExamTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExamEvaluator exam;

        while (true) {
            System.out.println("\n Exam Type:");
            System.out.println("1. Theory Exam");
            System.out.println("2. Practical Exam");
            System.out.println("3. Online Quiz");
            System.out.println("4. Exit");

            int choice = getValidChoice(scanner, " Choose: ", 1, 4);

            if (choice == 4) {
                System.out.println(" Exiting program. Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("\nEnter Theory Marks (out of 100):");
                    int phy = getValidMarks(scanner, "Physics: ", 100);
                    int math = getValidMarks(scanner, "Math: ", 100);
                    int chem = getValidMarks(scanner, "Chemistry: ", 100);
                    exam = new TheoryExam(phy, chem, math);
                    break;

                case 2:
                    System.out.println("\nEnter Practical Marks:");
                    int viva = getValidMarks(scanner, "Viva (out of 50): ", 50);
                    int sub = getValidMarks(scanner, "Submissions (out of 25): ", 25);
                    int exe = getValidMarks(scanner, "Execution (out of 25): ", 25);
                    exam = new PracticalExam(viva, sub, exe);
                    break;

                case 3:
                    int quiz = getValidMarks(scanner, "\nEnter Online Quiz Marks (out of 100): ", 100);
                    exam = new OnlineQuiz(quiz);
                    break;

                default:
                    continue;
            }

            exam.evaluateMarks();
            System.out.println("Grade: " + exam.calculateGrade());
        }

        scanner.close();
    }

    private static int getValidMarks(Scanner scanner, String prompt, int max) {
        int marks;
        while (true) {
            System.out.print(prompt);
            try {
                marks = scanner.nextInt();
                if (marks < 0 || marks > max) {
                    System.out.println(" Please enter a value between 0 and " + max + ".");
                } else {
                    return marks;
                }
            } catch (InputMismatchException e) {
                System.out.println(" Enter a valid number (no letters/symbols).");
                scanner.next(); 
            }
        }
    }

    private static int getValidChoice(Scanner scanner, String prompt, int min, int max) {
        int choice;
        while (true) {
            System.out.print(prompt);
            try {
                choice = scanner.nextInt();
                if (choice < min || choice > max) {
                    System.out.println(" Invalid choice. Choose between " + min + " and " + max + ".");
                } else {
                    return choice;
                }
            } catch (InputMismatchException e) {
                System.out.println(" Enter a valid number.");
                scanner.next();
            }
        }
    }
}
