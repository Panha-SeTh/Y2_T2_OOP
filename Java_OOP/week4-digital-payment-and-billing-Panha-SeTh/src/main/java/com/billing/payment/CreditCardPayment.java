package com.billing.payment;

public class CreditCardPayment implements PaymentMethod {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        if (cardNumber == null || cardNumber.isEmpty()) {
            throw new IllegalArgumentException("Card number cannot be null or blank");
        }
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(double amount) {
        return amount <= 5000;
    }

    @Override
    public String getPaymentType() {
        return "CREDIT_CARD";
    }

    public String getCardNumber() {
        return cardNumber;
    }
}