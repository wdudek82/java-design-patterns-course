package com.company.BehavioralPatterns.VisitorPattern;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
