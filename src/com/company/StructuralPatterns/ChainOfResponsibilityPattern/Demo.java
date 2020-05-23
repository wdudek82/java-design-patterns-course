package com.company.StructuralPatterns.ChainOfResponsibilityPattern;

public class Demo {
    public static void run() {
        Currency currency = new Currency(1380);

        AtmDispencer atmDispencer = new AtmDispencer();

        atmDispencer.c1.dispense(currency);
    }

    public static void runChallenge() {

    }
}
