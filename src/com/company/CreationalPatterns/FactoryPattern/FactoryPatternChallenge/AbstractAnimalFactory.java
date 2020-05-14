package com.company.CreationalPatterns.FactoryPattern.FactoryPatternChallenge;

public abstract class AbstractAnimalFactory {
    public abstract AnimalInterface getAnimal(AnimalType animalType);
}
