package com.company.BehavioralPatterns.VisitorPattern;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
