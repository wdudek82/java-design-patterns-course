package com.company.BehavioralPatterns.FacadePatternChallenge;

public class NonVegBothRestaurant implements Hotel {
    public Menus getMenus() {
        return new NonVegMenu();
    }
}
