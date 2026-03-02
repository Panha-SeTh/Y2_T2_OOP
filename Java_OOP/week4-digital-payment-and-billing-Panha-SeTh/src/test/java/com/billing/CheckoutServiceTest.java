package com.billing;

import org.junit.jupiter.api.Test;

import com.billing.model.*;
import com.billing.payment.*;
import com.billing.service.*;

import static org.junit.jupiter.api.Assertions.*;

public class CheckoutServiceTest {

    @Test
    void checkoutShouldReturnTrueIfPaymentSuccessful() {
        BillableItem item = new DigitalProduct("Course", 100, 10);
        PaymentMethod payment = new BankTransferPayment();
        CheckoutService service = new CheckoutService();

        assertTrue(service.checkout(item, payment));
    }

    @Test
    void checkoutShouldReturnFalseIfPaymentFails() {
        BillableItem item = new PhysicalProduct("Laptop", 6000, 2);
        PaymentMethod payment = new CreditCardPayment("1234");
        CheckoutService service = new CheckoutService();

        assertFalse(service.checkout(item, payment));
    }
}
