package com.company.StructuralPatterns.ProxyPatternChallenge;

public class RealConnector implements Connector {
    public RealConnector() {
    }

    @Override
    public void connect(String address) {
        System.out.println("Connects with: " + address);
    }
}
