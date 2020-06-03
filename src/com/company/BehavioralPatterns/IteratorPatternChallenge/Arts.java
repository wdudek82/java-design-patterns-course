package com.company.BehavioralPatterns.IteratorPatternChallenge;

public class Arts implements SubjectInterface {
    private final String[] subjects;

    public Arts() {
        this.subjects = new String[2];
        subjects[0] = "Bengali";
        subjects[1] = "English";
    }

    @Override
    public StudentsIterator createIterator() {
        return new ArtsIterator(subjects);
    }
}
