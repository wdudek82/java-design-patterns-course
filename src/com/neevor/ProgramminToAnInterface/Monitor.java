package com.neevor.ProgramminToAnInterface;

public class Monitor implements DisplayModule {
    @Override
    public void display() {
        System.out.println("Display through a monitor.");
    }
}
