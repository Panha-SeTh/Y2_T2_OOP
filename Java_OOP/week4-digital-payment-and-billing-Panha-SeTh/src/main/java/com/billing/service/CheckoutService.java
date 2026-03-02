package com.billing.service;

import com.billing.model.BillableItem;
import com.billing.payment.PaymentMethod;

public class CheckoutService {

    public boolean checkout(BillableItem item, PaymentMethod payment) {

        double amount = item.calculatePrice();

        return payment.pay(amount);
    }
}