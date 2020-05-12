package com.company.SingletonPattern;

public class Singleton {
    private int data = 0;

    private Singleton() {}

    private static class SingletonHelper {
        // Nested class is referenced after getInstance() is called
        private static final Singleton _uniqueInstance = new Singleton();
    }

    // by adding the synchronized keyword we force every thread
    // to wait its turn before it can access the method
    public static Singleton getInstance() {
        return SingletonHelper._uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
