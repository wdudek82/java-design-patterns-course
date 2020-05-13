package com.company.PrototypePatternChallenge;

import java.util.Hashtable;

public class BasicCarCache {
    private static final Hashtable<String, BasicCar> carsCache = new Hashtable<>();

    public static BasicCar getCar(String name) {
        BasicCar car = carsCache.get(name);

        try {
            return car.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void loadCache() {
        BasicCar ford = new Ford("Ford");
        carsCache.put(ford.name, ford);

        BasicCar nano = new Nano("Nano");
        carsCache.put(nano.name, nano);
    }
}
