package com.company.BehavioralPatterns.StrategyPatternChallenge;

public class OperationAdd implements CalculationStrategy {
    @Override
    public void performOperation(int x, int y) {
        System.out.println(x + " + " + y + " = " + (x + y));
    }
}
