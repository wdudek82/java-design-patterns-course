package com.company.StructuralPatterns.CommandPatternChallenge;

import com.company.StructuralPatterns.CommandPatternChallenge.Command.Order;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private final List<Order> orders;

    public Broker() {
        this.orders = new ArrayList<>();
    }

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
