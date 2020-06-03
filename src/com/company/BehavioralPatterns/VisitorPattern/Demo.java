package com.company.BehavioralPatterns.VisitorPattern;

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

    }
}
