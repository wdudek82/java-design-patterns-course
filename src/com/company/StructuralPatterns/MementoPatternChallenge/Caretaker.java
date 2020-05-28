package com.company.StructuralPatterns.MementoPatternChallenge;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private final List<Memento> objects = new ArrayList<>();

    public void save(Originator originator) {
        System.out.println("\nSaving state #" + (objects.size() + 1) + "...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        objects.add(originator.save());
    }

    public void undo(Originator originator, int index) {
        System.out.println("\nLoading state #" + index + "...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        if (objects.size() >= index) {
            originator.restore(objects.get(index - 1));
        } else {
            System.out.println("No saved data in this slot...");
        }
    }
}
