package com.billing;

import org.junit.jupiter.api.Test;

import com.billing.payment.*;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentMethodTest {

    @Test
    void creditCardShouldFailOverLimit() {
        PaymentMethod payment = new CreditCardPayment("1234");
        assertFalse(payment.pay(6000));
    }

    @Test
    void creditCardShouldPassUnderLimit() {
        PaymentMethod payment = new CreditCardPayment("1234");
        assertTrue(payment.pay(3000));
    }

    @Test
    void bankTransferAlwaysSucceeds() {
        PaymentMethod payment = new BankTransferPayment();
        assertTrue(payment.pay(100000));
    }

    @Test
    void qrCodeShouldFailIfTooSmallAmount() {
        PaymentMethod payment = new QRCodePayment();
        assertFalse(payment.pay(0.5));
    }
}
