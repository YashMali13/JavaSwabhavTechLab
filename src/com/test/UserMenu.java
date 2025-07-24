package com.test;

import java.util.*;

import com.model.Guitar;
import com.model.service.CartService;
import com.model.service.GuitarFileHandler;
import com.model.service.OrderService;

public class UserMenu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void start(String username) {
        while (true) {
            System.out.println("\n--- Welcome, " + username + " ---");
            System.out.println("1. View All Guitars");
            System.out.println("2. Filter Guitars");
            System.out.println("3. Add to Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Place Order");
            System.out.println("6. View Order History");
            System.out.println("7. Logout");
            System.out.print("Enter choice: ");
            int ch = scanner.nextInt(); scanner.nextLine();

            switch (ch) {
                case 1 -> GuitarFileHandler.displayGuitars(GuitarFileHandler.loadGuitars());
                case 2 -> filterGuitars();
                case 3 -> addToCart(username);
                case 4 -> CartService.displayCart(username);
                case 5 -> OrderService.placeOrder(username);
                case 6 -> OrderService.viewOrderHistory(username);
                case 7 -> { return; }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void filterGuitars() {
        List<Guitar> all = GuitarFileHandler.loadGuitars();
        System.out.print("Filter by (brand/id/price): ");
        String type = scanner.nextLine().toLowerCase();

        switch (type) {
            case "brand" -> {
                System.out.print("Enter brand: ");
                String b = scanner.nextLine().toLowerCase();
                all.stream().filter(g -> g.getBrand().equalsIgnoreCase(b))
                        .forEach(g -> System.out.println(g.toDisplay()));
            }
            case "id" -> {
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                all.stream().filter(g -> g.getId() == id)
                        .forEach(g -> System.out.println(g.toDisplay()));
            }
            case "price" -> {
                System.out.print("Enter max price: ");
                double max = scanner.nextDouble();
                all.stream().filter(g -> g.getPrice() <= max)
                        .forEach(g -> System.out.println(g.toDisplay()));
            }
            default -> System.out.println("Invalid filter.");
        }
    }

    private static void addToCart(String username) {
        System.out.print("Enter Guitar ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Quantity: ");
        int qty = scanner.nextInt();

        List<Guitar> all = GuitarFileHandler.loadGuitars();
        for (Guitar g : all) {
            if (g.getId() == id) {
                CartService.addToCart(username, g, qty);
                System.out.println("Added to cart.");
                return;
            }
        }
        System.out.println("Guitar not found...");
    }
}
