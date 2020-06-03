package com.company.BehavioralPatterns.InterpreterPatternChallenge;

public class AndExpression implements Expression {
    private final Expression expr1;
    private final Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(Context c) {
        return expr1.interpret(c) && expr2.interpret(c);
    }
}
