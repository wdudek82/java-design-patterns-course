package com.company.BuilderPattern;

public class Motorcycle implements Builder {
    private final Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a chassis of a motorcycle.");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added.");
    }

    @Override
    public void addHeadlights() {
        product.add("1 headlights are added.");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
