package com.company.StructuralPatterns.ObserverPatternChallenge;

// Implemented by CricketData to communicate with observers
public interface GameSubject {
    void registerObserver(GameObserver o);
    void unregisterObserver(GameObserver o);
    void notifyObservers();
}
