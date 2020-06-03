package com.company.BehavioralPatterns.InterpreterPattern;

public class InterpreterClient {
    public InterpreterContext ic;

    public InterpreterClient(InterpreterContext i) {
        this.ic = i;
    }

    public String interpreter(String str) {
        Expression exp = null;

        // perform the parsing
        if (str.contains("Hexadecimal")) {
            exp = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else if (str.contains("Binary")) {
            exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else {
            return str;
        }

        return exp.interpret(ic);
    }
}
