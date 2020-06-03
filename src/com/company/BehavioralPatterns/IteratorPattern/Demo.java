package com.company.BehavioralPatterns.IteratorPattern;

import com.company.BehavioralPatterns.IteratorPatternChallenge.*;

public class Demo {
    public static void run() {
        NotificationCollection nc = new NotificationCollection();
        NotificationBar nb = new NotificationBar(nc);

        nb.printNotifications();
    }

    public static void runChallenge() {
        System.out.println("******** Iterator Pattern Demo ********\n");

        SubjectInterface s = new Science();
        SubjectInterface a = new Arts();

        StudentsIterator scIterator = s.createIterator();
        StudentsIterator aIterator = a.createIterator();

        StudentsClient.print(scIterator);
        StudentsClient.print(aIterator);
    }
}
