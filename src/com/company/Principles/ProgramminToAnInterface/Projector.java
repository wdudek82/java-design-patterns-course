package com.company.Principles.ProgramminToAnInterface;

public class Projector implements DisplayModule {
    @Override
    public void display() {
        System.out.println("Display through a projector.");
    }
}
