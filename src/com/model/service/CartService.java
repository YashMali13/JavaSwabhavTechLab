package com.model.service;

import java.io.*;
import java.util.*;

import com.model.Guitar;

public class CartService {
	public static void addToCart(String username, Guitar g, int qty) {
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter("cart_" + username + ".txt", true))) {
	        writer.write(g.getId() + "," + g.getBrand() + "," + g.getType() + "," + g.getGenre() + "," +
	                     g.getPrice() + "," + g.getStock() + "," + qty);
	        writer.newLine();
	    } catch (IOException e) {
	        System.out.println(" Failed to add to cart.");
	    }
	}



    public static List<String> readCart(String username) {
        List<String> cart = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("cart_" + username + ".txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                cart.add(line);
            }
        } catch (IOException e) {
            System.out.println(" Cart is empty or missing.");
        }
        return cart;
    }

    public static void clearCart(String username) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("cart_" + username + ".txt"))) {
            // clear content
        } catch (IOException e) {
            System.out.println(" Error clearing cart.");
        }
    }
    public static void displayCart(String username) {
        List<String> items = readCart(username);
        for (String line : items) {
            String[] parts = line.split(",");
            System.out.printf("ID: %s | %s | Type: %s | Genre: %s | ₹%.2f | Stock: %s | Qty: %s\n",
                    parts[0], parts[1], parts[2], parts[3], Double.parseDouble(parts[4]), parts[5], parts[6]);
        }
    }

}

