package com.company.CreationalPatterns.BuilderPattern;

public class Car implements Builder {
    private final Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a chassis of a car.");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels are added.");
    }

    @Override
    public void addHeadlights() {
        product.add("2 headlights are added.");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
