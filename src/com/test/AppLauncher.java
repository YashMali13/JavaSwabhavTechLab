package com.test;


import java.util.Scanner;

public class AppLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nWelcome to Guitar Shop");
            System.out.println("1. Admin Mode");
            System.out.println("2. User Mode");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> AdminMenu.start();
                case 2 -> {
                    System.out.print("Enter your username: ");
                    String username = scanner.nextLine();
                    UserMenu.start(username);
                }
                case 3 -> {
                    System.out.println("Thank you. Exiting.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
