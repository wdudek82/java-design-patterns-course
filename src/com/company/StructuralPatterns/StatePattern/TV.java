package com.company.StructuralPatterns.StatePattern;

public class TV {
    private RemoteControl state;

    public TV() {
        this.state = new Off();
    }

    public RemoteControl getState() {
        return state;
    }

    public void setState(RemoteControl state) {
        this.state = state;
    }

    public void pressButton() {
        state.pressSwitch(this);
    }
}
