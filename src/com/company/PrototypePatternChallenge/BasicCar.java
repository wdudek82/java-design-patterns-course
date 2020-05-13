package com.company.PrototypePatternChallenge;

public abstract class BasicCar implements Cloneable {
    public String name;
    public double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    protected BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar) super.clone();
    }
}
