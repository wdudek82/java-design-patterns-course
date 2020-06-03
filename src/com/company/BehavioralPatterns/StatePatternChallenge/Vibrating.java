package com.company.BehavioralPatterns.StatePatternChallenge;

public class Vibrating extends PhoneState {
    @Override
    public void alert() {
        System.out.println("vibrating...");
    }
}
