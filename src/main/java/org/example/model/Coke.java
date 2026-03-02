package org.example.model;

public class Coke extends ProductForSale {

    private double volume;

    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.volume = 1.0;
    }

    public Coke(String type, double price, String description, double volume) {
        super(type, price, description);
        this.volume = volume;
    }

    @Override
    public void showDetails() {
        System.out.println(getType() + " - " + getPrice() + " - " + getDescription());
        System.out.println("Volume: " + volume + "L");
    }
}