package com.company.BehavioralPatterns.StatePattern;

public class Off extends RemoteControl {
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I'm Off. Going to be On now.");
        context.setState(new On());
    }
}
