package com.company.BuilderPattern;

public interface Builder {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Product getVehicle();
}
