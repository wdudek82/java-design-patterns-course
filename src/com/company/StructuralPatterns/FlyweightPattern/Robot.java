package com.company.StructuralPatterns.FlyweightPattern;

public class Robot implements RobotInterface {
    public RobotType robotType;
    public String colorOfRobot;

    public Robot(RobotType robotType) {
        this.robotType = robotType;
    }

    @Override
    public void setColor(String colorOfRobot) {
        this.colorOfRobot = colorOfRobot;
    }

    @Override
    public void print() {
        System.out.println("This is a " + robotType + " type robot with " + colorOfRobot + " color");
    }
}
