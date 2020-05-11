package com.company.AbstractFactoryChallenge;

import com.company.AbstractFactoryChallenge.Products.BollywoodMovie;
import com.company.AbstractFactoryChallenge.Products.HollywoodMovie;

public interface MovieFactory {
    HollywoodMovie getHollywoodMovie();
    BollywoodMovie getBollywoodMovie();
}
