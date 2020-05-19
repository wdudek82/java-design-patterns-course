package com.company.BehavioralPatterns.DecoratorPattern.Example1;

public class ConcreteComponent extends Component {
    @Override
    public void doJob() {
        System.out.println("I am from a Concreate Component - I am closed for modification.");
    }
}
