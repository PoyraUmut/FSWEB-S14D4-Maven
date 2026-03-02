package org.example.model;

public class Bread extends ProductForSale {

    private String flourType;

    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.flourType = "Standard";
    }

    public Bread(String type, double price, String description, String flourType) {
        super(type, price, description);
        this.flourType = flourType;
    }

    @Override
    public void showDetails() {
        System.out.println(getType() + " - " + getPrice() + " - " + getDescription());
        System.out.println("Flour Type: " + flourType);
    }
}