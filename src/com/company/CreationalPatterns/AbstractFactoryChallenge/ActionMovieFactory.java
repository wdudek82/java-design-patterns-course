package com.company.CreationalPatterns.AbstractFactoryChallenge;

import com.company.CreationalPatterns.AbstractFactoryChallenge.Products.*;

public class ActionMovieFactory implements MovieFactory {
    @Override
    public HollywoodMovie getHollywoodMovie() {
        return new HollywoodActionMovie();
    }

    @Override
    public BollywoodMovie getBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}
