package com.company.StructuralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
    private final List<Observer> observers;
    private String message;
    private boolean changed;

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (obj == null) throw new NullPointerException("Null Observer");
        if (!observers.contains(obj)) {
            observers.add(obj);
        }
    }

    @Override
    public void unregister(Object obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;

        if (!changed) return;

        observersLocal = new ArrayList<>(this.observers);
        this.changed = false;

        for (Observer observer : observersLocal) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    // method to post message to the topic, change state (trigger notifications)
    public void postMessage(String msg) {
        System.out.println("Message Posted to Topic: " + msg);

        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
}
