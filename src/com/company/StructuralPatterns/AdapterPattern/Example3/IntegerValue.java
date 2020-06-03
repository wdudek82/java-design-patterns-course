package com.company.StructuralPatterns.AdapterPattern.Example3;

public class IntegerValue implements IntegerValueInterface {
    @Override
    public int getInteger() {
        return 5;
    }
}
