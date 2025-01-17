package org.example.handler;

import org.example.Order;

public class InventoryCheckHandler extends OrderValidationHandler {

    @Override
    public void validate(Order order) {
        if (order != null && isItemsInStock(order)) {
            System.out.println("Inventory check passed for order: " + order.getId());
            super.validate(order);
        } else {
            System.out.println("Inventory check failed for order: " + order.getId());
            throw new IllegalStateException("Items are out of stock for order: " + order.getId());
        }
    }

    private boolean isItemsInStock(Order order) {
        return true; // We assume items are in stock
    }
}
