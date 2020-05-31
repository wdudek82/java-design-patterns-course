package com.company.StructuralPatterns.StatePattern;

import com.company.StructuralPatterns.StatePatternChallenge.Silent;
import com.company.StructuralPatterns.StatePatternChallenge.SmartPhone;
import com.company.StructuralPatterns.StatePatternChallenge.Vibrating;

public class Demo {
    public static void run() {
        TV tv = new TV();

        tv.pressButton();
        tv.pressButton();
    }

    public static void runChallenge() {
        SmartPhone smartPhone = new SmartPhone();

        smartPhone.alert();
        smartPhone.alert();

        smartPhone.setState(new Vibrating());

        smartPhone.alert();
        smartPhone.alert();

        smartPhone.setState(new Silent());

        smartPhone.alert();
        smartPhone.alert();
    }
}
