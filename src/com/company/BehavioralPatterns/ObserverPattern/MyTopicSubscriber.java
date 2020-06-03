package com.company.BehavioralPatterns.ObserverPattern;

public class MyTopicSubscriber implements Observer {
    private String name;

    // not required, could just pass subjects state to update,
    // but also used to attach
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);

        if (msg == null) {
            System.out.println(name + " :: No new message");
        } else {
            System.out.println(name + " :: Consuming message :: " + msg);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
