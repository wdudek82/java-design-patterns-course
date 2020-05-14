package com.neevor.FactoryPatternChallenge;

public abstract class AbstractAnimalFactory {
    public abstract AnimalInterface getAnimal(AnimalType animalType);
}
