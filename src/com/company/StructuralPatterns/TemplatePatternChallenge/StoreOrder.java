package com.company.StructuralPatterns.TemplatePatternChallenge;

public class StoreOrder extends OrderProcessTemplate {
    @Override
    protected void selectWrapping() {
        System.out.println("Select wrapping in the store.");
    }

    @Override
    protected void doSelect() {
        System.out.println("Pick the item from shelf.");
    }

    @Override
    protected void doPayment() {
        System.out.println("Pay for selected item at the checkout.");
    }

    @Override
    protected void doDelivery() {
        System.out.println("Take bought item with you.");
    }
}
