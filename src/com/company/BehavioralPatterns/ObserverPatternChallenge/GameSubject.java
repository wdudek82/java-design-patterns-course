package com.company.BehavioralPatterns.ObserverPatternChallenge;

// Implemented by CricketData to communicate with observers
public interface GameSubject {
    void registerObserver(GameObserver o);
    void unregisterObserver(GameObserver o);
    void notifyObservers();
}
