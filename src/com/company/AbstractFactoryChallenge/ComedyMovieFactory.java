package com.company.AbstractFactoryChallenge;

import com.company.AbstractFactoryChallenge.Products.*;

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
