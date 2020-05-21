package com.company.BehavioralPatterns.FlyweightPattern;

public class Demo {
    public static void run() {
        RobotFactory robotFactory = new RobotFactory();
        RobotInterface robotOne;
        RobotInterface robotTwo;

        for (var i = 0; i < 2; i++) {
            robotOne = robotFactory.getRobot(RobotType.SMALL_ROBOT);
            robotOne.print();
        }

        for (var i = 0; i < 5; i++) {
            robotTwo = robotFactory.getRobot(RobotType.LARGE_ROBOT);
            robotTwo.print();
        }

        int numOfDistinctRobots = robotFactory.totalObjectsCreated();
        System.out.println("\nDistinct Robot objects created till now = " + numOfDistinctRobots);
    }

    public static void runChallenge() {

    }
}
