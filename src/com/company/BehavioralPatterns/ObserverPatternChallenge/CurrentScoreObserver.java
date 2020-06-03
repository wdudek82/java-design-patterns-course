package com.company.BehavioralPatterns.ObserverPatternChallenge;

public class CurrentScoreObserver implements GameObserver {
    private int runs, wickets;
    private float overs;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }

    private void display() {
        String sb = "\nCurrent Score Display: \n" +
                "Runs: " +
                runs +
                "\nWickets: " +
                wickets +
                "\nOvers: " +
                overs;
        System.out.println(sb);
    }
}
