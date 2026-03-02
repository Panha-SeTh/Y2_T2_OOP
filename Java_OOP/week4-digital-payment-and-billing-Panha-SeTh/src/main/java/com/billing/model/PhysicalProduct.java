package com.billing.model;

public class PhysicalProduct extends BillableItem {

    private double weight;

    public PhysicalProduct(String name, double basePrice, double weight) {
        super(name, basePrice);

        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be > 0");
        }

        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double calculatePrice() {
        double shipping = weight * 2;
        return getBasePrice() + shipping;
    }
}