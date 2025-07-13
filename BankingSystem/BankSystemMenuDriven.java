package BankingSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankSystemMenuDriven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountOperations account = null;

        while (true) {
            System.out.println("\n========= BANK SYSTEM =========");
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.println("3. Loan Account");
            System.out.println("4. Exit");
            System.out.print("=> Enter your choice: ");
            int choice = getValidIntInput(scanner);

            switch (choice) {
                case 1:
                    account = new SavingsAccount(10000);
                    accountMenu(scanner, account, "Savings");
                    break;
                case 2:
                    account = new CurrentAccount(20000);
                    accountMenu(scanner, account, "Current");
                    break;
                case 3:
                    account = new LoanAccount(50000);
                    accountMenu(scanner, account, "Loan");
                    break;
                case 4:
                    System.out.println(" Exiting system. Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println(" Invalid choice! Try again.");
            }
        }
    }

    public static void accountMenu(Scanner scanner, AccountOperations account, String accountType) {
        while (true) {
            System.out.println("\n--- " + accountType.toUpperCase() + " ACCOUNT MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Back to Main Menu ");
            System.out.print("-> Enter your choice: ");
            int option = getValidIntInput(scanner);

            switch (option) {
                case 1:
                    if (accountType.equalsIgnoreCase("Loan")) {
                        System.out.println(" Deposits not allowed in Loan Account.");
                        break;
                    }
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = getValidDoubleInput(scanner);
                    account.deposit(deposit);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdraw = getValidDoubleInput(scanner);
                    account.withdraw(withdraw);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println(" -> Returning to main menu...");
                    return;
                default:
                    System.out.println(" Invalid option. Try again.");
            }
        }
    }

    public static int getValidIntInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.print(" Please enter a valid number: ");
                scanner.next(); // clear buffer
            }
        }
    }

    public static double getValidDoubleInput(Scanner scanner) {
        while (true) {
            try {
                double val = scanner.nextDouble();
                if (val <= 0) throw new InvalidAmountException("Amount must be more than zero.");
                return val;
            } catch (InputMismatchException e) {
                System.out.print(" Invalid input. Enter a valid amount: ");
                scanner.next(); // clear buffer
            } catch (InvalidAmountException e) {
                System.out.println(" No... " + e.getMessage());
            }
        }
    }
}