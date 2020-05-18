package com.company.BehavioralPatterns.CompositePattern.Example2;


public class Developer implements Employee {
    private final String name;
    private final long emloyeeId;
    private final String position;

    public Developer(String name, long emloyeeId, String position) {
        this.name = name;
        this.emloyeeId = emloyeeId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(emloyeeId + " " + name + " " + position);
    }
}
