package com.company.AbstractFactoryChallenge;

import com.company.AbstractFactoryChallenge.Products.Genre;

public class MovieFactoryProducer {
    public static MovieFactory getFactory(Genre type) {
        return switch (type) {
            case ACTION -> new ActionMovieFactory();
            case COMEDY -> new ComedyMovieFactory();
        };
    }
}
