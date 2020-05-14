package com.company.CreationalPatterns.SingletonPattern;

import com.company.CreationalPatterns.SingletonPatternChallenge.CaptainSingleton;

public class Demo {
    public static void run() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("Data 1: " + s1.getData());
        System.out.println("Data 2: " + s2.getData());

        s1.setData(1);

        System.out.println("Data 3: " + s1.getData());
        System.out.println("Data 4: " + s2.getData());

        s2.setData(2);

        System.out.println("Data 5: " + s1.getData());
        System.out.println("Data 6: " + s2.getData());

        if (s1 == s2) {
            System.out.println("Same object");
            System.out.println("First reference:" + s1);
            System.out.println("Second reference:" + s2);
        }
    }

    public static void runChallenge() {
        CaptainSingleton c1 = CaptainSingleton.getIntance();
        CaptainSingleton c2 = CaptainSingleton.getIntance();

        System.out.println("First reference:" + c1);
        System.out.println("Second reference:" + c2);

        if (c1 == c2) {
            System.out.println("Same object");
        }
    }
}
