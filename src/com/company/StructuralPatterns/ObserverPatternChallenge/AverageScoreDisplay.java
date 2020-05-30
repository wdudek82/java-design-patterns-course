package com.company.StructuralPatterns.ObserverPatternChallenge;

public class AverageScoreDisplay implements GameObserver {
    private float runRate;
    private int predictedScore;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runRate = runs / overs;
        this.predictedScore = (int) this.runRate * 50;

        display();
    }

    private void display() {
        String sb = "\nAverage Score Display: \n" +
                "Run Rate: " +
                runRate +
                "\nPredictedScore: " +
                predictedScore;
        System.out.println(sb);
    }
}
