package com.company.BehavioralPatterns.IteratorPatternChallenge;

import java.util.LinkedList;

public class Science implements SubjectInterface {
    private final LinkedList<String> subjects;

    public Science() {
        this.subjects = new LinkedList<>();
        subjects.add("Maths");
        subjects.add("Comp. Sc.");
        subjects.add("Physics");
    }

    @Override
    public StudentsIterator createIterator() {
        return new ScienceIterator(subjects);
    }
}
