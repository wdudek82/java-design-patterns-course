package com.company.BehavioralPatterns.VisitorPattern;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        int cost = book.getPrice();

        if (cost > 50) {
            int DISCOUNT = 5;
            cost -= DISCOUNT;
        }

        System.out.println("Book ISBN:: " + book.getIsbnNumber() + " cost = " + cost);

        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();

        System.out.println(fruit.getName() + " cost = " + cost);

        return cost;
    }
}
