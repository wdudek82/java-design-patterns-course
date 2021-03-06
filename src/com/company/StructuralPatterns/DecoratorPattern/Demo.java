package com.company.StructuralPatterns.DecoratorPattern;

import com.company.StructuralPatterns.DecoratorPattern.Example1.*;
import com.company.StructuralPatterns.DecoratorPattern.Example2.LowerCaseInputStream;
import com.company.StructuralPatterns.DecoratorPatternChallenge.*;

import java.io.*;

public class Demo {
    public static void run() {
        // example1();
        // example2();
    }

    public static void runChallenge() {
        Shape circle = new Circle();
        Shape square = new Square();

        ShapeDecorator red = new RedShapeDecorator();
        ShapeDecorator green = new GreenShapeDecorator();

        red.setShape(circle);
        green.setShape(square);

        red.draw();
        green.draw();
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
