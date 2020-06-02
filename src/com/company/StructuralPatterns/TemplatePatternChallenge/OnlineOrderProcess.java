package com.company.StructuralPatterns.TemplatePatternChallenge;

public class OnlineOrderProcess extends OrderProcessTemplate {
    @Override
    protected void selectWrapping() {
        System.out.println("Select wrapping on the page.");
    }

    @Override
    protected void doSelect() {
        System.out.println("Add selected item to the basket.");
    }

    @Override
    protected void doPayment() {
        System.out.println("Go to check in page and use the wizard. Pass your credit card details.");
    }

    @Override
    protected void doDelivery() {
        System.out.println("The item will be delivered by courier.");
    }
}
