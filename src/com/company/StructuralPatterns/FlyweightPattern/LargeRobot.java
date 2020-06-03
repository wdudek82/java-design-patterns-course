package com.company.StructuralPatterns.FlyweightPattern;

public class LargeRobot implements RobotInterface {
    @Override
    public void print() {
        System.out.println("This is a large robot.");
    }

    @Override
    public void setColor(String colorOfRobot) {

    }
}
