package com.company.BehavioralPatterns.VisitorPattern;

interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
