package com.billing.model;

public abstract class BillableItem {

	private String name;
	private double basePrice;

	public BillableItem(String name, double basePrice) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name must not be blank");
		}

		if (basePrice < 0) {
			throw new IllegalArgumentException("Base price must be >= 0");
		}

		this.name = name;
		this.basePrice = basePrice;
	}

	public String getName() {
		return name;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public abstract double calculatePrice();
}
