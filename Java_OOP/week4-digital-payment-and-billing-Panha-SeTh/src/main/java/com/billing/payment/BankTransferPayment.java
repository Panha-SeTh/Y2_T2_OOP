package com.billing.payment;

public class BankTransferPayment implements PaymentMethod {

    @Override
    public boolean pay(double amount) {
        return true; // always succeeds
    }

    @Override
    public String getPaymentType() {
        return "BANK_TRANSFER";
    }
}