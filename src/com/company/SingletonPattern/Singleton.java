package com.company.SingletonPattern;

public class Singleton {
    private static Singleton uniqueInstance = null;
    private int data = 0;

    private Singleton() {}

    // by adding the synchronized keyword we force every thread
    // to wait its turn before it can access the method
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }

        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
