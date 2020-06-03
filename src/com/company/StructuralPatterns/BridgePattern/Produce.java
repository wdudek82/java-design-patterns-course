package com.company.StructuralPatterns.BridgePattern;

public class Produce extends Workshop {
    @Override
    public void work() {
        System.out.println("Produced.");
    }
}
