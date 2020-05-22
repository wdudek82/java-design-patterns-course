package com.company.BehavioralPatterns.ProxyPattern;

import com.company.BehavioralPatterns.ProxyPatternChallenge.ProxyConnector;

public class Demo {
    public static void run() {
        ProxyImage proxyImage = new ProxyImage("someFilename.jpg");

        proxyImage.display();

        System.out.println("*".repeat(50));

        proxyImage.display();
    }

    public static void runChallenge() {
        ProxyConnector proxyConnector = new ProxyConnector();

        proxyConnector.connect("www.foo.com");
        proxyConnector.connect("www.bam.com");
    }
}
