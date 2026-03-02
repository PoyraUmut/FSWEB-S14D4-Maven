package org.example.model;

public class Chocolate extends ProductForSale {

    private int cocoaPercentage;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
        this.cocoaPercentage = 50;
    }

    public Chocolate(String type, double price, String description, int cocoaPercentage) {
        super(type, price, description);
        this.cocoaPercentage = cocoaPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println(getType() + " - " + getPrice() + " - " + getDescription());
        System.out.println("Cocoa: %" + cocoaPercentage);
    }
}