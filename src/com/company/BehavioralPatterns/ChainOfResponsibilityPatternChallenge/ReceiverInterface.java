package com.company.BehavioralPatterns.ChainOfResponsibilityPatternChallenge;

public interface ReceiverInterface {
    boolean processMessage(Message message);
    void setNextChain(ReceiverInterface nextChain);
}
