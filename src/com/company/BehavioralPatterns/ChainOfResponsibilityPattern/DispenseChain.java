package com.company.BehavioralPatterns.ChainOfResponsibilityPattern;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}
