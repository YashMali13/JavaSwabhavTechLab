package com.model.service;

import java.io.*;
import java.util.*;

import com.model.Genre;
import com.model.Guitar;
import com.model.GuitarType;

public class GuitarFileHandler {
    private static final String FILE_NAME = "guitars.txt";

    public static List<Guitar> loadGuitars() {
        List<Guitar> guitars = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                Guitar guitar = new Guitar(
                        Integer.parseInt(parts[0]),
                        parts[1],
                        parts[2],
                        GuitarType.valueOf(parts[3]),
                        Genre.valueOf(parts[4]),
                        Double.parseDouble(parts[5]),
                        Integer.parseInt(parts[6])
                );
                guitars.add(guitar);
            }
        } catch (IOException e) {
            System.out.println("Error loading guitars: " + e.getMessage());
        }
        return guitars;
    }

    public static void saveGuitars(List<Guitar> guitars) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Guitar g : guitars) {
                writer.write(g.toFileString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving guitars: " + e.getMessage());
        }
    }


public static void displayGuitars(List<Guitar> guitars) {
    if (guitars.isEmpty()) {
        System.out.println("No guitars available.");
    } else {
        for (Guitar g : guitars) {
            System.out.println(g.toDisplay());
        }
    }
}

	

	
}

