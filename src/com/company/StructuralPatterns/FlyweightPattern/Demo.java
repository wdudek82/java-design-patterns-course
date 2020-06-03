package com.company.StructuralPatterns.FlyweightPattern;

import com.company.StructuralPatterns.FlyweightPatternChallenge.Player;
import com.company.StructuralPatterns.FlyweightPatternChallenge.PlayerFactory;
import com.company.StructuralPatterns.FlyweightPatternChallenge.PlayerType;
import com.company.StructuralPatterns.FlyweightPatternChallenge.WeaponType;

public class Demo {
    public static void run() {
        RobotFactory robotFactory = new RobotFactory();
        RobotInterface robotOne = robotFactory.getRobot(RobotType.SMALL_ROBOT);
        RobotInterface robotTwo;

        robotOne.setColor("red");

        for (var i = 0; i < 3; i++) {
            robotOne = robotFactory.getRobot(RobotType.SMALL_ROBOT);
            robotOne.print();
            robotOne.setColor("blue");
        }

        for (var i = 0; i < 5; i++) {
            robotTwo = robotFactory.getRobot(RobotType.LARGE_ROBOT);
            robotTwo.setColor("green");
            robotTwo.print();
        }

        int numOfDistinctRobots = robotFactory.totalObjectsCreated();
        System.out.println("\nDistinct Robot objects created till now = " + numOfDistinctRobots);
    }

    public static void runChallenge() {
        PlayerFactory playerFactory = new PlayerFactory();
        Player playerOne = playerFactory.getPlayer(PlayerType.TERRORIST);
        Player playerTwo = playerFactory.getPlayer(PlayerType.COUNTER_TERRORIST);

        playerOne.assignWeapon(WeaponType.PISTOL);
        playerTwo.assignWeapon(WeaponType.ASSAULT_RIFLE);

        playerOne.mission();
        playerTwo.mission();

        playerOne.assignWeapon(WeaponType.KNIFE);
        playerTwo.assignWeapon(WeaponType.PISTOL);

        playerOne.mission();
        playerTwo.mission();
    }
}
