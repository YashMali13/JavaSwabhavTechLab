package com.model.service;

import com.model.Guitar;
import java.io.*;
import java.util.*;

public class OrderService {

    public static void placeOrder(String username) {
        List<String> cart = CartService.readCart(username);
        List<Guitar> allGuitars = GuitarFileHandler.loadGuitars();
        List<String> newOrders = new ArrayList<>();

        for (String item : cart) {
            if (item.trim().isEmpty()) continue; // Skip empty lines

            String[] parts = item.split(",");
            if (parts.length < 7) {
                System.out.println(" Skipping invalid cart item: " + item);
                continue;
            }

            try {
                int id = Integer.parseInt(parts[0].trim());
                int qty = Integer.parseInt(parts[6].trim());

                for (Guitar g : allGuitars) {
                    if (g.getId() == id) {
                        if (g.getStock() >= qty) {
                            g.setStock(g.getStock() - qty);
                            String orderLine = username + "," + g.getId() + "," + g.getBrand() + "," +
                                    g.getType() + "," + g.getGenre() + "," + g.getPrice() + "," +
                                    qty + "," + new Date();
                            newOrders.add(orderLine);
                        } else {
                            System.out.println(" Not enough stock for ID: " + g.getId());
                        }
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println(" Invalid number format in cart item: " + item);
            }
        }

        // Write valid orders to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("orders.txt", true))) {
            for (String order : newOrders) {
                writer.write(order);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println(" Failed to write orders.");
        }

        // Update stock in guitars.txt
        GuitarFileHandler.saveGuitars(allGuitars);

        // Clear cart
        File cartFile = new File("cart_" + username + ".txt");
        if (cartFile.exists()) cartFile.delete();

        System.out.println(" Order placed successfully!");
    }

    public static void viewOrderHistory(String username) {
        try (BufferedReader reader = new BufferedReader(new FileReader("orders.txt"))) {
            boolean found = false;
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith(username + ",")) {
                    String[] parts = line.split(",");
                    if (parts.length < 8) {
                        System.out.println(" Corrupted order entry: " + line);
                        continue;
                    }

                    try {
                        System.out.printf("ID: %s | Brand: %s | Type: %s | Genre: %s | ₹%.2f | Qty: %s | Date: %s\n",
                                parts[1], parts[2], parts[3], parts[4],
                                Double.parseDouble(parts[5]), parts[6], parts[7]);
                        found = true;
                    } catch (NumberFormatException e) {
                        System.out.println(" Invalid price in order: " + line);
                    }
                }
            }

            if (!found) {
                System.out.println(" No orders found for user: " + username);
            }
        } catch (IOException e) {
            System.out.println("Failed to read order history.");
        }
    }
}
