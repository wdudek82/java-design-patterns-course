package com.company.BehavioralPatterns.BridgePattern;

public class Demo {
    public static void run() {
        Workshop w1 = new Produce();
        Workshop w2 = new Assemble();

        Vehicle car = new Car(w1, w2);
        Vehicle bike = new Bike(w1, w2);

        car.manufacture();
        bike.manufacture();
    }

    public static void runChallenge() {

    }
}
