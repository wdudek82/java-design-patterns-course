package com.company.BehavioralPatterns.ObserverPatternChallenge;

import java.util.ArrayList;

public class CricketData implements GameSubject {
    int runs;
    int wickets;
    float overs;

    ArrayList<GameObserver> observers;

    public CricketData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(GameObserver o) {
        if (observers.contains(o)) return;
        observers.add(o);
    }

    @Override
    public void unregisterObserver(GameObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (GameObserver observer : observers) {
            observer.update(runs, wickets, overs);
        }
    }

    // get latest runs from stadium
    private int getLatestRuns() {
        return 90;
    }

    private int getLatestWickets() {
        return 2;
    }

    private float getLatestOvers() {
        return 10.2f;
    }

    public void dataChanged() {
        // get latest data
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        notifyObservers();
    }
}
