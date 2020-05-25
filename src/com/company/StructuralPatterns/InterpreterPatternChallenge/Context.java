package com.company.StructuralPatterns.InterpreterPatternChallenge;

public class Context {
    String input;

    public Context(String input) {
        this.input = input;
    }

    public boolean getResult(String data) {
        return input.contains(data);
    }
}
