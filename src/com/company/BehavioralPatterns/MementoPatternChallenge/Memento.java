package com.company.BehavioralPatterns.MementoPatternChallenge;

import java.util.Date;

public class Memento {
    private final String name;
    private final Date date;

    public Memento(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
}
