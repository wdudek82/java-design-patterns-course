package com.company.StructuralPatterns.IteratorPattern;

public class NotificationIterator implements Iterator {
    Notification[] notifications;
    int pos = 0;

    public NotificationIterator(Notification[] notifications) {
        this.notifications = notifications;
    }

    @Override
    public boolean hasNext() {
        return pos < notifications.length && notifications[pos] != null;
    }

    @Override
    public Object next() {
        Notification notification = notifications[pos];
        pos += 1;
        return notification;
    }
}
