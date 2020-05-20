package com.company.BehavioralPatterns.FacadePatternChallenge;

public class HotelKeeper {
    public VegRestaurant veg;
    public NonVegRestaurant nonVeg;
    public NonVegBothRestaurant both;

    public HotelKeeper() {
        this.veg = new VegRestaurant();
        this.nonVeg = new NonVegRestaurant();
        this.both = new NonVegBothRestaurant();
    }

    public Menus getVeganMenu() {
        return this.veg.getMenus();
    }

    public Menus getNonVeganMenu() {
        return this.nonVeg.getMenus();
    }

    public Menus getBoth() {
        return this.both.getMenus();
    }
}
