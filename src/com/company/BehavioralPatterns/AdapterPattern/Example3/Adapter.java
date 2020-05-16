package com.company.BehavioralPatterns.AdapterPattern.Example3;

public class Adapter extends IntegerValue {

    @Override
    public int getInteger() {
        return 2 + super.getInteger();
    }
}
