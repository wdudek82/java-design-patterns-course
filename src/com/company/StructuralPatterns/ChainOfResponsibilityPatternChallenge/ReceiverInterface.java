package com.company.StructuralPatterns.ChainOfResponsibilityPatternChallenge;

public interface ReceiverInterface {
    boolean processMessage(Message message);
    void setNextChain(ReceiverInterface nextChain);
}
