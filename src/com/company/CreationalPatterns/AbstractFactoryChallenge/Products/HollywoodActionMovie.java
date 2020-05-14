package com.company.CreationalPatterns.AbstractFactoryChallenge.Products;

public class HollywoodActionMovie implements HollywoodMovie {

    @Override
    public void play() {
        System.out.println("Movie played: Hollywood Action Movie");
    }
}
