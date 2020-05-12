package com.company.BuilderPattern;
import java.util.LinkedList;

public class Product {
    LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<>();
    }

    public void add(String part) {
        this.parts.add(part);
    }

    public void show() {
        System.out.println("\n Product completed as below:");

        for (int i = 0; i < parts.size(); i++) {
            System.out.println(i + ": " + parts.get(i));
        }
    }
}
