package com.company.StructuralPatterns.StatePatternChallenge;

public class Vibrating extends PhoneState {
    @Override
    public void alert() {
        System.out.println("vibrating...");
    }
}
