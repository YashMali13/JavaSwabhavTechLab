package SmartHomeController;

import java.util.Scanner;

public class SmartHomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Controllable[] devices = {
            new Light(),
            new Fan(),
            new TV(),
            new Speaker()
        };

        String[] deviceNames = {"Light", "Fan", "TV", "Speaker"};

        System.out.println("=== Welcome to Smart Home Device Controller ===");

        while (true) {
            System.out.println("\nAvailable Devices:");
            for (int i = 0; i < deviceNames.length; i++) {
                System.out.println((i + 1) + ". " + deviceNames[i]);
            }
            System.out.println("5. Exit");

            int choice = getValidInteger(scanner, "Enter your choice (1-5): ", 1, 5);

            if (choice == 5) {
                System.out.println(" Exiting Smart Home Controller. Goodbye!");
                break;
            }

            Controllable device = devices[choice - 1];
            String name = deviceNames[choice - 1];

            while (true) {
                System.out.println("\n--- " + name + " Menu ---");
                System.out.println("1. Turn ON");
                System.out.println("2. Turn OFF");
                System.out.println("3. Set Mode");
                System.out.println("4. Back to Device List");

                int action = getValidInteger(scanner, "Enter your choice (1-4): ", 1, 4);

                switch (action) {
                    case 1:
                        device.turnOn();
                        break;
                    case 2:
                        device.turnOff();
                        break;
                    case 3:
                        while (true) {
                            System.out.print("Enter mode for " + name + ": ");
                            String mode = scanner.nextLine().trim();
                            try {
                                device.setMode(mode);
                                break; // exit mode loop if successful
                            } catch (IllegalArgumentException e) {
                                System.out.println(" " + e.getMessage());
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Returning to device list...");
                        break;
                }

                if (action == 4) break;
            }
        }

        scanner.close();
    }    
    
    private static int getValidInteger(Scanner scanner, String prompt, int min, int max) {
        int input = -1;
        while (true) {
            System.out.print(prompt);
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.println(" Please enter a number between " + min + " and " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println(" Invalid input. Please enter a numeric value.");
            }
        }
    }
}
