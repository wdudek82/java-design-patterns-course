package com.neevor.ProgramminToAnInterface;

public class Computer {
    private DisplayModule dm;

    // public Computer(DisplayModule dm) {
    //     this.dm = dm;
    // }

    public DisplayModule getDisplayMddule() {
        return dm;
    }

    public void setDisplayModule(DisplayModule dm) {
        this.dm = dm;
    }

    public void display() {
        if (this.dm == null) {
            System.out.println("Connect some display module first!");
        } else {
            this.dm.display();
        }
    }
}
