package com.company.StructuralPatterns.IteratorPatternChallenge;

public interface StudentsIterator {
    void first();

    String next();

    boolean isDone();

    String currentItem();
}
