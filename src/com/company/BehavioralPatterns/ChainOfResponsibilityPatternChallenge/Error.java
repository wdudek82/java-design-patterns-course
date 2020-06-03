package com.company.BehavioralPatterns.ChainOfResponsibilityPatternChallenge;

public class Error {
    private final String type;
    private final Message message;

    public Error(String type, MessagePriority priority, String message) {
        this.type = type;
        this.message = new Message(priority, message);
    }

    public String getType() {
        return type;
    }

    public Message getMessage() {
        return message;
    }
}
