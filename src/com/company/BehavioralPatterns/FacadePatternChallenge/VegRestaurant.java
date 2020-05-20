package com.company.BehavioralPatterns.FacadePatternChallenge;

public class VegRestaurant implements Hotel {
    public Menus getMenus() {
        return new VegMenu();
    }
}
