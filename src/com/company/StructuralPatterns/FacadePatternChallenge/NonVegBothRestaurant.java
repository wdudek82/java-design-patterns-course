package com.company.StructuralPatterns.FacadePatternChallenge;

public class NonVegBothRestaurant implements Hotel {
    public Menus getMenus() {
        return new NonVegMenu();
    }
}
