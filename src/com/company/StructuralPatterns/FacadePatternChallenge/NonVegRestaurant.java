package com.company.StructuralPatterns.FacadePatternChallenge;

public class NonVegRestaurant implements Hotel {
    public Menus getMenus() {
        return new NonVegMenu();
    }
}
