package com.company.BehavioralPatterns.StatePatternChallenge;

public class SmartPhone {
    private PhoneState state;

    public SmartPhone() {
        this.state = new Silent();
    }

    public PhoneState getState() {
        return state;
    }

    public void setState(PhoneState state) {
        this.state = state;
    }

    public void alert() {
        state.alert();
    }
}
