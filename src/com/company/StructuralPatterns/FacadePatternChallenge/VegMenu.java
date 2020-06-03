package com.company.StructuralPatterns.FacadePatternChallenge;

public class VegMenu extends Menus {
    public VegMenu() {
        System.out.println("Creating a veg menu.");
    }

    @Override
    public void showMenu() {
        System.out.println("Vegan menu.");
    }
}
