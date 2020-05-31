package com.company.StructuralPatterns.StatePatternChallenge;

public class Silent extends PhoneState {
    @Override
    public void alert() {
        System.out.println("silent...");
    }
}
