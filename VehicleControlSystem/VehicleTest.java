package VehicleControlSystem;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleControl vehicle = null;

        while (true) {
            System.out.println("\n==== VEHICLE CONTROL SYSTEM ====");
            System.out.println("1. Car");
            System.out.println("2. Bike");
            System.out.println("3. Truck");
            System.out.println("4. Exit");
            System.out.print(" Enter your choice: ");

            int choice = getValidInt(scanner);

            switch (choice) {
                case 1:
                    vehicle = new Car();
                    break;
                case 2:
                    vehicle = new Bike();
                    break;
                case 3:
                    vehicle = new Truck();
                    break;
                case 4:
                    System.out.println(" Exiting Vehicle System. Bye!");
                    scanner.close();
                    return;
                default:
                    System.out.println(" Invalid choice.");
                    continue;
            }

            vehicle.start();  

            while (true) {
                System.out.println("\n-- CONTROL OPTIONS --");
                System.out.println("1. Change Gear");
                System.out.println("2. Stop Vehicle");
                System.out.print(" Choose an option: ");
                int op = getValidInt(scanner);

                switch (op) {
                    case 1:
                        System.out.print("Enter gear number: ");
                        int gear = getValidInt(scanner);
                        vehicle.changeGear(gear);
                        break;
                    case 2:
                        vehicle.stop();
                       
                        break;
                    default:
                        System.out.println(" Invalid choice.");
                        continue;
                }

                if (op == 2) break; 
            }
        }
    }

    public static int getValidInt(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Enter a valid number: ");
                scanner.next(); // clear buffer
            }
        }
    }
}