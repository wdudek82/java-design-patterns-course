package com.company.StructuralPatterns.ObserverPattern;

public interface Subject {
    void register(Observer obj);

    void unregister(Object obj);

    void notifyObservers();

    // method to get updates from subject, not required,
    // but added so observers can query subject
    Object getUpdate(Observer obj);
}
