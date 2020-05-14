package com.company.CreationalPatterns.AbstractFactoryChallenge;

import com.company.CreationalPatterns.AbstractFactoryChallenge.Products.*;

public class ComedyMovieFactory implements MovieFactory {
    @Override
    public HollywoodMovie getHollywoodMovie() {
        return new HollywoodComedyMovie();
    }

    @Override
    public BollywoodMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}
