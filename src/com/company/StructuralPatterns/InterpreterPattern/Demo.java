package com.company.StructuralPatterns.InterpreterPattern;

import com.company.StructuralPatterns.InterpreterPatternChallenge.Context;
import com.company.StructuralPatterns.InterpreterPatternChallenge.Expression;
import com.company.StructuralPatterns.InterpreterPatternChallenge.InterpreterClient;

public class Demo {
    public static void run() {
        // String str1 = "28 in Binary";
        // String str2 = "28 in Hexadecimal";
        //
        // InterpreterClient ec = new InterpreterClient(new InterpreterContext());
        // System.out.println(str1 + " = " + ec.interpreter(str1));
        // System.out.println(str2 + " = " + ec.interpreter(str2));
    }

    public static void runChallenge() {
        Expression isMale = InterpreterClient.getMaleExpression();
        Expression isMarriedWoman = InterpreterClient.getMarriedWomanExpression();

        Context ic = new Context("John");
        System.out.println("John is male? " + isMale.interpret(ic));

        Context ic2 = new Context("Married Julie");
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret(ic2));

        Context ic3 = new Context("Married Lucy");
        System.out.println("Lucy is male? " + isMale.interpret(ic3));
    }
}
