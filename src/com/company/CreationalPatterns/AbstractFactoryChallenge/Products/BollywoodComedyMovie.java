package com.company.CreationalPatterns.AbstractFactoryChallenge.Products;

public class BollywoodComedyMovie implements BollywoodMovie {

    @Override
    public void play() {
        System.out.println("Movie played: Bollywood Comedy");
    }
}
