package com.company.BehavioralPatterns.VisitorPatternChallenge;

public interface PostageVisitor {
    void visit(Book book);
    void visit(CD cd);
    void visit(DVD dvd);
}
