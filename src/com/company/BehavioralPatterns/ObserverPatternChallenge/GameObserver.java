package com.company.BehavioralPatterns.ObserverPatternChallenge;

// This interface is implemented by all those
// classes that are to be updated whenever there
// is an update from CricketData
public interface GameObserver {
    void update(int runs, int wickets, float overs);
}
