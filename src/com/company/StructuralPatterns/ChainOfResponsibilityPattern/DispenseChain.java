package com.company.StructuralPatterns.ChainOfResponsibilityPattern;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}
