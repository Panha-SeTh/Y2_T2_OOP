package com.billing.payment;

public class QRCodePayment implements PaymentMethod {

    @Override
    public boolean pay(double amount) {
        return amount >= 1;
    }

    @Override
    public String getPaymentType() {
        return "QR_CODE";
    }
}