package com.company.BehavioralPatterns.VisitorPatternChallenge;

public interface Element {
    void accept(PostageVisitor visitor);
}
