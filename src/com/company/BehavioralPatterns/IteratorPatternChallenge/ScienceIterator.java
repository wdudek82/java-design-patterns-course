package com.company.BehavioralPatterns.IteratorPatternChallenge;

import java.util.LinkedList;

public class ScienceIterator implements StudentsIterator {
    private final LinkedList<String> subjects;
    private int position;

    public ScienceIterator(LinkedList<String> subjects) {
        this.subjects = subjects;
        position = 0;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        return subjects.get(position++);
    }

    @Override
    public boolean isDone() {
        return subjects.size() <= position;
    }

    @Override
    public String currentItem() {
        return subjects.get(position);
    }
}
