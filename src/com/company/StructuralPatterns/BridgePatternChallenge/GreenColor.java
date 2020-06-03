package com.company.StructuralPatterns.BridgePatternChallenge;

public class GreenColor implements Color {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Green color with " + border + " inch border");
    }
}
