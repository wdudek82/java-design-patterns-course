package com.company.CreationalPatterns.AbstractFactoryPattern;

public abstract class AbstractFactory<T, S> {
    abstract T getItem(S type);
}
