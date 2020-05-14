package com.company.CreationalPatterns.AbstractFactoryChallenge.Products;

public class HollywoodComedyMovie implements HollywoodMovie {

    @Override
    public void play() {
        System.out.println("Movie played: Hollywood Comedy");
    }
}
