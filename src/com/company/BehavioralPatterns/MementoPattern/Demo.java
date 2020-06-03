package com.company.BehavioralPatterns.MementoPattern;

import com.company.BehavioralPatterns.MementoPatternChallenge.Caretaker;
import com.company.BehavioralPatterns.MementoPatternChallenge.Originator;

public class Demo {
    public static void run() {
        FileWriterCaretaker fileWriterCaretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriterUtil = new FileWriterUtil("data.txt");
        fileWriterUtil.write("Ala");
        fileWriterUtil.write(" ma");

        fileWriterCaretaker.save(fileWriterUtil);

        fileWriterUtil.write(" kota.");

        System.out.println(fileWriterUtil.toString());

        fileWriterCaretaker.undo(fileWriterUtil);

        System.out.println(fileWriterUtil.toString());
    }

    public static void runChallenge() {
        Caretaker caretaker = new Caretaker();

        Originator originator = new Originator("DeusEx");
        originator.printDate();

        caretaker.save(originator);

        originator.updateDate();
        originator.printDate();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        originator.updateDate();
        caretaker.save(originator);
        originator.printDate();

        caretaker.undo(originator, 3);
        caretaker.undo(originator, 2);
        originator.printDate();
        caretaker.undo(originator, 1);
        originator.printDate();
    }
}
