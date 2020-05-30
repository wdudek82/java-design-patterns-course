package com.company.StructuralPatterns.ObserverPattern;

import com.company.StructuralPatterns.ObserverPatternChallenge.AverageScoreDisplay;
import com.company.StructuralPatterns.ObserverPatternChallenge.CricketData;
import com.company.StructuralPatterns.ObserverPatternChallenge.CurrentScoreObserver;

public class Demo {
    public static void run() {
        MyTopic topic = new MyTopic();

        Observer obj1 = new MyTopicSubscriber("Obj1");
        Observer obj2 = new MyTopicSubscriber("Obj2");
        Observer obj3 = new MyTopicSubscriber("Obj3");

        // register observers to the subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        // attach observer to subject (not required, could have also passed in subject state)
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        // check if any update is available, not required
        obj1.update();

        topic.postMessage("This is a new message.");
    }

    public static void runChallenge() {
        // create objects for testing
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CurrentScoreObserver currentScoreObserver = new CurrentScoreObserver();

        // pass the displays to crickets data
        CricketData cricketData = new CricketData();

        // register display elements
        cricketData.registerObserver(averageScoreDisplay);
        cricketData.registerObserver(currentScoreObserver);

        // in real app you would have some logic to call this function when data changes
        cricketData.dataChanged();

        cricketData.unregisterObserver(averageScoreDisplay);

        cricketData.dataChanged();
    }
}
