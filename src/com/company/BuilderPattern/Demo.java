package com.company.BuilderPattern;

public class Demo {
    public static void run() {
        Builder carBuilder = new Car();
        Builder motorcycleBuilder = new Motorcycle();

        Director director = new Director();

        director.construct(carBuilder);
        Product car = carBuilder.getVehicle();
        car.show();

        director.construct(motorcycleBuilder);
        Product motorcycle = motorcycleBuilder.getVehicle();
        motorcycle.show();
    }

    public static void runChallenge() {
    }
}
