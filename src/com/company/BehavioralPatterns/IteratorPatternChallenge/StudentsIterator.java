package com.company.BehavioralPatterns.IteratorPatternChallenge;

public interface StudentsIterator {
    void first();

    String next();

    boolean isDone();

    String currentItem();
}
