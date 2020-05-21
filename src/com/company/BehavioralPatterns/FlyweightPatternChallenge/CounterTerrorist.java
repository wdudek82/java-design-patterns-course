package com.company.BehavioralPatterns.FlyweightPatternChallenge;

public class CounterTerrorist implements Player {
    private final String TASK;
    private WeaponType weapon;

    public CounterTerrorist() {
        this.TASK = "Disarm a bomb";
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void assignWeapon(WeaponType type) {
        this.weapon = type;
    }

    @Override
    public void mission() {
        System.out.println("Player: Counter Terrorist, Weapon: " + weapon + ", Mission: " + TASK);
    }
}
