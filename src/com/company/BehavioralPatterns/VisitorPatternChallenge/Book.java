package com.company.BehavioralPatterns.VisitorPatternChallenge;

public class Book implements Element {
    private final double price;
    private final double weight;

    public Book(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(PostageVisitor visitor) {
        System.out.println("Book :: price: " + price + ", weight: " + weight);

        visitor.visit(this);
    }
}
