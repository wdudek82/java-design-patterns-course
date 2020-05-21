package com.company.BehavioralPatterns.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    private Map<String, RobotInterface> robots = new HashMap<>();

    public int totalObjectsCreated() {
        return robots.size();
    }

    public RobotInterface getRobot(RobotType type) {
        if (robots.containsKey(type.name())) {
            return robots.get(type.name());
        }

        RobotInterface robotCategory = switch (type) {
            case SMALL_ROBOT -> new SmallRobot();
            case LARGE_ROBOT -> new LargeRobot();
        };

        robots.put(type.name(), robotCategory);

        return robotCategory;
    }
}
