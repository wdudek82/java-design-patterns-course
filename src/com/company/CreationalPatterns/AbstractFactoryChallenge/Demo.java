package com.company.CreationalPatterns.AbstractFactoryChallenge;

import com.company.CreationalPatterns.AbstractFactoryChallenge.Products.BollywoodMovie;
import com.company.CreationalPatterns.AbstractFactoryChallenge.Products.Genre;
import com.company.CreationalPatterns.AbstractFactoryChallenge.Products.HollywoodMovie;

public class Demo {
    public static void run() {
        MovieFactory actionMovies = MovieFactoryProducer.getFactory(Genre.ACTION);
        MovieFactory comedyMovies = MovieFactoryProducer.getFactory(Genre.COMEDY);

        HollywoodMovie hollywoodActionMovie = actionMovies.getHollywoodMovie();
        BollywoodMovie bollywoodActionMovie = actionMovies.getBollywoodMovie();

        HollywoodMovie hollywoodComedyMovie = comedyMovies.getHollywoodMovie();
        BollywoodMovie bollywoodComedyMovie = comedyMovies.getBollywoodMovie();

        hollywoodActionMovie.play();
        bollywoodActionMovie.play();

        hollywoodComedyMovie.play();
        bollywoodComedyMovie.play();
    }
}
