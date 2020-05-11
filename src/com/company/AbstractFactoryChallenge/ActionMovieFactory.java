package com.company.AbstractFactoryChallenge;

import com.company.AbstractFactoryChallenge.Products.*;

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
