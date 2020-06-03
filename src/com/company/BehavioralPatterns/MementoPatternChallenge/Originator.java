package com.company.BehavioralPatterns.MementoPatternChallenge;

import java.sql.Timestamp;
import java.util.Date;

public class Originator {
    private String name;
    private Date date;

    public Originator(String name) {
        this.name = name;
        this.date = new Date();
    }

    public void printDate() {
        Timestamp timestamp = new Timestamp(date.getTime());
        System.out.println("\n" + timestamp);
    }

    public void updateDate() {
        this.date = new Date();
    }

    public Memento save() {
        return new Memento(name, date);
    }

    public void restore(Memento memento) {
        this.name = memento.getName();
        this.date = memento.getDate();
    }
}
