package com.company.BehavioralPatterns.CommandPatternChallenge.Receiver;

public class Stock {
    private final String name;
    private final int quantity;

    public Stock() {
        this.name = "Google";
        this.quantity = 1000;
    }

    public Stock(int quantity) {
        this.name = "Google";
        this.quantity = quantity;
    }

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
    };

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
    };
}
