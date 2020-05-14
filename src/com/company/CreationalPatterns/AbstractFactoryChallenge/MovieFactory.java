package com.company.CreationalPatterns.AbstractFactoryChallenge;

import com.company.CreationalPatterns.AbstractFactoryChallenge.Products.BollywoodMovie;
import com.company.CreationalPatterns.AbstractFactoryChallenge.Products.HollywoodMovie;

public interface MovieFactory {
    HollywoodMovie getHollywoodMovie();
    BollywoodMovie getBollywoodMovie();
}
