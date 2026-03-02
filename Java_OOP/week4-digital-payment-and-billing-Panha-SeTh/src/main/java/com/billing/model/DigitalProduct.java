package com.billing.model;

public class DigitalProduct extends BillableItem {

    private double fileSizeMB;

    public DigitalProduct(String name, double basePrice, double fileSizeMB) {
        super(name, basePrice);

        if (fileSizeMB <= 0) {
            throw new IllegalArgumentException("File size must be > 0");
        }

        this.fileSizeMB = fileSizeMB;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    @Override
    public double calculatePrice() {
        return getBasePrice();
    }
}