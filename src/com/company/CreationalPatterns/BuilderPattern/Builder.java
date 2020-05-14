package com.company.CreationalPatterns.BuilderPattern;

public interface Builder {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Product getVehicle();
}
