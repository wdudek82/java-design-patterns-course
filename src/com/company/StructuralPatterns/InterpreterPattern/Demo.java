package com.company.StructuralPatterns.InterpreterPattern;

public class Demo {
    public static void run() {
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";

        InterpreterClient ec = new InterpreterClient(new InterpreterContext());
        System.out.println(str1 + " = " + ec.interpreter(str1));
        System.out.println(str2 + " = " + ec.interpreter(str2));
    }

    public static void runChallenge() {

    }
}
