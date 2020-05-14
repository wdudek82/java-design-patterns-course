package com.company.StructuralPatternsChallenge;

public class OperationSubtract implements CalculationStrategy {
    @Override
    public void performOperation(int x, int y) {
        System.out.println(x + " - " + y + " = " + (x - y));
    }
}
