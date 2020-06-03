package com.company.BehavioralPatterns.TemplatePatternChallenge;

public abstract class OrderProcessTemplate {
    public boolean isGift;

    public final void processOrder() {
        doSelect();

        if (isGift) {
            selectWrapping();
        }

        doPayment();

        if (isGift) {
            giftWrap();
        }

        doDelivery();

        System.out.println("Order has been successfully processed!");
    }

    protected abstract void selectWrapping();

    protected final void giftWrap() {
        System.out.println("The item is being wrapped.");
    };

    protected abstract void doSelect();

    protected abstract void doPayment();

    protected abstract void doDelivery();
}
