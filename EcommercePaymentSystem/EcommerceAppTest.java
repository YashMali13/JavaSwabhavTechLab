package EcommercePaymentSystem;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EcommerceAppTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentGateway gateway = null;

        while (true) {
            System.out.println("\n====== E-COMMERCE PAYMENT SYSTEM ======");
            System.out.println("1. Pay using Credit Card");
            System.out.println("2. Pay using UPI");
            System.out.println("3. Pay using Net Banking");
            System.out.println("4. Exit");
            System.out.print(" Enter your choice: ");

            int choice = getValidInt(scanner);

            switch (choice) {
                case 1:
                    gateway = new CreditCard();
                    break;
                case 2:
                    gateway = new UPI();
                    break;
                case 3:
                    gateway = new NetBanking();
                    break;
                case 4:
                    System.out.println("Exiting app. Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
                    continue;
            }

            Checkout checkout = new Checkout(gateway);
            boolean back = false;

            while (!back) {
                System.out.println("\n-- Payment Options --");
                System.out.println("1. Make Payment");
                System.out.println("2. Request Refund");
                System.out.println("3. Back to Main Menu");
                System.out.print(" Choose an option: ");

                int subOption = getValidInt(scanner);

                switch (subOption) {
                    case 1:
                        System.out.print("Enter amount to pay: ₹");
                        double payAmount = getValidAmount(scanner);
                        checkout.processPayment(payAmount);
                        break;
                    case 2:
                        System.out.print("Enter amount to refund: ₹");
                        double refundAmount = getValidAmount(scanner);
                        checkout.processRefund(refundAmount);
                        break;
                    case 3:
                        back = true;
                        break;
                    default:
                        System.out.println(" Invalid choice. Try again.");
                }
            }
        }
    }

    public static int getValidInt(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.print(" Enter a valid number: ");
                scanner.next();
            }
        }
    }

   
    public static double getValidAmount(Scanner scanner) {
        while (true) {
            try {
                double val = scanner.nextDouble();
                if (val <= 0) throw new InvalidAmountException("Amount must be greater than 0.");
                return val;
            } catch (InputMismatchException e) {
                System.out.print(" Enter a valid amount: ");
                scanner.next();
            } catch (InvalidAmountException e) {
                System.out.println(" No... " + e.getMessage());
            }
        }
      
    }
}
