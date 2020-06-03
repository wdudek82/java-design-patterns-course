package com.company.BehavioralPatterns.StrategyPattern;

public class PayPalStrategy implements PaymentStrategy {
    private String email_id;
    private String password;

    public PayPalStrategy(String email_id, String password) {
        this.email_id = email_id;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with PayPal.");
    }
}
