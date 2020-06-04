package com.company.BehavioralPatterns.VisitorPattern;

import com.company.BehavioralPatterns.VisitorPatternChallenge.*;

public class Demo {
    public static void run() {
        ItemElement[] items = new ItemElement[]{
                new Book(20, "1234"),
                new Book(100, "5432"),
                new Fruit(10, 2, "Banana"),
                new Fruit(5, 5, "Apple"),
        };

        int total = calculatePrice(items);

        System.out.println("Total Cost = " + total);
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor scv = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (ItemElement item : items) {
            sum += item.accept(scv);
        }

        return sum;
    }

    public static void runChallenge() {
        Element[] elements = new Element[]{
                new com.company.BehavioralPatterns.VisitorPatternChallenge.Book(20, 10),
                new com.company.BehavioralPatterns.VisitorPatternChallenge.Book(100, 3),
                new CD(10, 1),
                new CD(18, 1),
                new DVD(5, 1),
                new DVD(25, 1),
        };

        calculateUSTotalPostage(elements);
        calculateSouthAmericaTotalPostage(elements);
    }

    private static void calculateUSTotalPostage(Element[] elements) {
        USPostageVisitor usPostageVisitor = new USPostageVisitor();
        for (Element element : elements) {
            element.accept(usPostageVisitor);
        }
        double result = usPostageVisitor.getTotalPostage();
    }

    private static void calculateSouthAmericaTotalPostage(Element[] elements) {
        SouthAmericaPostageVisitor southAmericaPostageVisitor = new SouthAmericaPostageVisitor();
        for (Element element : elements) {
            element.accept(southAmericaPostageVisitor);
        }
        double result = southAmericaPostageVisitor.getTotalPostage();
    }
}
