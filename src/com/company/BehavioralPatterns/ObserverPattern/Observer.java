package com.company.BehavioralPatterns.ObserverPattern;

public interface Observer {
    // method to update the observer, used by subject
    void update();

    // attach with subject to observe, not required,
    // but added so that the observer can query the subject to see
    // if an update has occurred
    void setSubject(Subject subject);
}
