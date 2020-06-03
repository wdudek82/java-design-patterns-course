package com.company.StructuralPatterns.BridgePattern;

import com.company.StructuralPatterns.BridgePatternChallenge.*;

public class Demo {
    public static void run() {
        Workshop w1 = new Produce();
        Workshop w2 = new Assemble();

        Vehicle car = new Car(w1, w2);
        Vehicle bike = new Bike(w1, w2);

        car.manufacture();
        bike.manufacture();
    }

    public static void runChallenge() {
        Shape triangle = new Triangle(new RedColor());
        Shape rectangle = new Rectangle(new GreenColor());

        triangle.drawShape(2);
        triangle.modifyBorder(3, 2);

        rectangle.drawShape(4);
        rectangle.modifyBorder(1, 3);
    }
}
