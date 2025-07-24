package com.model;

public class Guitar {
    private int id;
    private String brand;
    private String model;
    private GuitarType type;
    private Genre genre;
    private double price;
    private int stock;

    public Guitar(int id, String brand, String model, GuitarType type, Genre genre, double price, int stock) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.genre = genre;
        this.price = price;
        this.stock = stock;
    }

    public int getId() { return id; }
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public GuitarType getType() { return type; }
    public Genre getGenre() { return genre; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    public void setPrice(double price) { this.price = price; }
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return String.format("ID: %d | %s %s | Type: %s | Genre: %s | ₹%.2f | Stock: %d",
                id, brand, model, type, genre, price, stock);
    }

    public String toFileString() {
        return String.format("%d,%s,%s,%s,%s,%.2f,%d",
                id, brand, model, type, genre, price, stock);
    }

 // Inside com.model.Guitar
    public String toDisplay() {
        return String.format("ID: %d | %s %s | ₹%.2f | Type: %s | Genre: %s | Stock: %d",
                id, brand, model, price, type, genre, stock);
    }


	
}

