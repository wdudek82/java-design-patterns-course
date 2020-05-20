package com.company.BehavioralPatterns.FacadePatternChallenge;

public class NonVegRestaurant implements Hotel {
    public Menus getMenus() {
        return new NonVegMenu();
    }
}
