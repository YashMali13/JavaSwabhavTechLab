package com.test;

import com.model.Guitar;
import com.model.GuitarType;
import com.model.Genre;
import com.model.service.GuitarFileHandler;
import java.util.*;

public class AdminMenu {
    static Scanner scanner = new Scanner(System.in);

    public static void start() {
        List<Guitar> guitars = GuitarFileHandler.loadGuitars();
        while (true) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. View all guitars");
            System.out.println("2. Add guitar");
            System.out.println("3. Update price");
            System.out.println("4. Update stock");
            System.out.println("5. Delete guitar");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            int ch = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (ch) {
                case 1 -> guitars.forEach(System.out::println);
                case 2 -> addGuitar(guitars);
                case 3 -> updatePrice(guitars);
                case 4 -> updateStock(guitars);
                case 5 -> deleteGuitar(guitars);
                case 6 -> {
                    System.out.println("Exiting admin menu.");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void addGuitar(List<Guitar> guitars) {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt(); scanner.nextLine();
        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter Model: ");
        String model = scanner.nextLine();
        System.out.print("Enter Type (ACOUSTIC/ELECTRIC): ");
        GuitarType type = GuitarType.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Enter Genre (ROCK/JAZZ/...): ");
        Genre genre = Genre.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Stock: ");
        int stock = scanner.nextInt();
        guitars.add(new Guitar(id, brand, model, type, genre, price, stock));
        GuitarFileHandler.saveGuitars(guitars);
        System.out.println("Guitar added.");
    }

    private static void updatePrice(List<Guitar> guitars) {
        System.out.print("Enter ID to update price: ");
        int id = scanner.nextInt();
        Optional<Guitar> g = guitars.stream().filter(git -> git.getId() == id).findFirst();
        if (g.isPresent()) {
            System.out.print("Enter new price: ");
            double price = scanner.nextDouble();
            g.get().setPrice(price);
            GuitarFileHandler.saveGuitars(guitars);
            System.out.println("Price updated.");
        } else System.out.println("Guitar not found.");
    }

    private static void updateStock(List<Guitar> guitars) {
        System.out.print("Enter ID to update stock: ");
        int id = scanner.nextInt();
        Optional<Guitar> g = guitars.stream().filter(git -> git.getId() == id).findFirst();
        if (g.isPresent()) {
            System.out.print("Enter new stock: ");
            int stock = scanner.nextInt();
            g.get().setStock(stock);
            GuitarFileHandler.saveGuitars(guitars);
            System.out.println("Stock updated.");
        } else System.out.println("Guitar not found.");
    }

    private static void deleteGuitar(List<Guitar> guitars) {
        System.out.print("Enter ID to delete: ");
        int id = scanner.nextInt();
        boolean removed = guitars.removeIf(g -> g.getId() == id);
        if (removed) {
            GuitarFileHandler.saveGuitars(guitars);
            System.out.println("Guitar deleted.");
        } else System.out.println("Guitar not found.");
    }
}

