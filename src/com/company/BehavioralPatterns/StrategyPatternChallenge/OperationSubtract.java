package com.company.BehavioralPatterns.StrategyPatternChallenge;

public class OperationSubtract implements CalculationStrategy {
    @Override
    public void performOperation(int x, int y) {
        System.out.println(x + " - " + y + " = " + (x - y));
    }
}
