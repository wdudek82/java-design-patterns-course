package com.company.BehavioralPatterns.CompositePatternChallenge;

public class Professor implements Faculty {
    private final String name;
    private final String position;
    private final int officeNumber;

    public Professor(String name, String position, int officeNumber) {
        this.name = name;
        this.position = position;
        this.officeNumber = officeNumber;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    @Override
    public void getDetail() {
        System.out.println("Name: " + getName() + " Position: " + getPosition());
    }
}
