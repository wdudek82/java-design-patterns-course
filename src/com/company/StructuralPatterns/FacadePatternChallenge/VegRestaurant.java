package com.company.StructuralPatterns.FacadePatternChallenge;

public class VegRestaurant implements Hotel {
    public Menus getMenus() {
        return new VegMenu();
    }
}
