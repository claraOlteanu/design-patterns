package org.example.handler;

import org.example.Order;

public class PaymentValidationHandler extends OrderValidationHandler {

    @Override
    public void validate(Order order) {
        if (order != null && isPaymentValid(order)) {
            System.out.println("Payment validation passed for order: " + order.getId());
            super.validate(order); // Pass to the next handler in the chain
        } else {
            System.out.println("Payment validation failed for order: " + order.getId());
            throw new IllegalStateException("Payment is invalid for order: " + order.getId());
        }
    }

    private boolean isPaymentValid(Order order) {
        return order.getTotalAmount() > 0; // Valid if the total amount is greater than zero
    }
}
