package org.example.command;

import org.example.Order;

public class PlaceOrderCommand implements OrderCommand {
    private final Order order;

    public PlaceOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        if (order == null || !order.isValid()) {
            System.out.println("Order placement failed: Invalid order.");
            return;
        }

        System.out.println("Order placed successfully: " + order.getId());
    }
}
