package com.company.CreationalPatterns.AbstractFactoryChallenge.Products;

public class BollywoodActionMovie implements BollywoodMovie {

    @Override
    public void play() {
        System.out.println("Movie played: Bollywood Action Movie");
    }
}
