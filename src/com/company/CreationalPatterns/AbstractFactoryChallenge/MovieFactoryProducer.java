package com.company.CreationalPatterns.AbstractFactoryChallenge;

import com.company.CreationalPatterns.AbstractFactoryChallenge.Products.Genre;

public class MovieFactoryProducer {
    public static MovieFactory getFactory(Genre type) {
        return switch (type) {
            case ACTION -> new ActionMovieFactory();
            case COMEDY -> new ComedyMovieFactory();
        };
    }
}
