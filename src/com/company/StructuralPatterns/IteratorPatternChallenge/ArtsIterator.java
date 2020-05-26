package com.company.StructuralPatterns.IteratorPatternChallenge;

public class ArtsIterator implements StudentsIterator {
    private final String[] subjects;
    private int position;

    public ArtsIterator(String[] subjects) {
        this.subjects = subjects;
        position = 0;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        return subjects[position++];
    }

    @Override
    public boolean isDone() {
        return subjects.length <= position;
    }

    @Override
    public String currentItem() {
        return subjects[position];
    }
}
