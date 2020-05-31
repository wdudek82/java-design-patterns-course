package com.company.StructuralPatterns.StatePattern;

public class On extends RemoteControl {
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I'm already ON. Going to be Off now.");
        context.setState(new Off());
    }
}
