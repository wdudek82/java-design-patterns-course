package com.company.CreationalPatterns.FactoryPattern.FactoryPatternChallenge;

public class AnimalFactory extends AbstractAnimalFactory {
    public AnimalInterface getAnimal(AnimalType animalType) {
        return switch (animalType) {
            case FROG -> new Frog();
            case TIGER -> new Tiger();
        };
    }
}
