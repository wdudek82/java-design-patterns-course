package com.company.BehavioralPatterns.DecoratorPattern;

import com.company.BehavioralPatterns.DecoratorPattern.Example1.*;
import com.company.BehavioralPatterns.DecoratorPattern.Example2.LowerCaseInputStream;

import java.io.*;

public class Demo {
    public static void run() {
        // example1();
        example2();
    }

    public static void runChallenge() {

    }

    public static void example1() {
        Component c1 = new ConcreteComponent();
        AbstractDecorator dc1 = new ConcreteDecoratorOne();
        AbstractDecorator dc2 = new ConcreteDecoratorTwo();

        dc1.setComponent(c1);
        dc2.setComponent(c1);

        // c1.doJob();
        dc1.doJob();
        dc2.doJob();
    }

    public static void example2() {
        int c = 0;
        byte[] bytes = "Jason Fedin aaaAAbbBBccCCddDD".getBytes();

        InputStream input = new LowerCaseInputStream(new ByteArrayInputStream(bytes));

        while (true) {
            try {
                if (!((c = input.read()) >= 0)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.print((char) c);
        }

        try {
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
