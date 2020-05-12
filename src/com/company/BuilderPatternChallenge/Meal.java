package com.company.BuilderPatternChallenge;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    List<Item> items;

    public Meal() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double getCost() {
        double totalCost = 0;
        for (Item item : items) {
            totalCost += item.getPrice();
        }

        return totalCost;
    }

    public void showItems() {
        System.out.println("\n:: Completed meal order:");

        for (int i = 0; i < items.size(); i++) {
            System.out.println("Item: " + items.get(i).getName());
            System.out.println("Price: " + items.get(i).getPrice());
            System.out.print("Packed: ");
            items.get(i).getPacking().pack();
            System.out.println("=".repeat(20));
        }

        System.out.println("Total cost: " + getCost());
        System.out.println("=".repeat(20));
    }
}
