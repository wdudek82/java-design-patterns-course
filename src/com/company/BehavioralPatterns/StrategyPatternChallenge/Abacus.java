package com.company.BehavioralPatterns.StrategyPatternChallenge;

public class Abacus {
    public void calculate(CalculationStrategy calculationStrategy, int x, int y) {
        calculationStrategy.performOperation(x, y);
    }
}
