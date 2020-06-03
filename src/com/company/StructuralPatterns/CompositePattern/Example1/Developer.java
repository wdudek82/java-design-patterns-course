package com.company.StructuralPatterns.CompositePattern.Example1;

public class Developer implements Employee {
    private String name;
    private long emloyeeId;
    private String position;

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
