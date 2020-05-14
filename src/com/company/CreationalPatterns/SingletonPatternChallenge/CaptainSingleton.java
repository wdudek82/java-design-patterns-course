package com.company.CreationalPatterns.SingletonPatternChallenge;

public class CaptainSingleton {
    private String name;

    private CaptainSingleton() {}

    private static class CaptainSingletonHelper {
        private static final CaptainSingleton uniqueCaptain = new CaptainSingleton();
    }

    public static CaptainSingleton getIntance() {
        return CaptainSingletonHelper.uniqueCaptain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
