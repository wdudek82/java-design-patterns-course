package com.company.CreationalPatterns.FactoryPattern.FactoryPatternChallenge;

public class Client {
    public static void run() {
        AbstractAnimalFactory animalFactory = new AnimalFactory();

        AnimalInterface animal1 = animalFactory.getAnimal(AnimalType.FROG);
        AnimalInterface animal2 = animalFactory.getAnimal(AnimalType.TIGER);

        animal1.makeASound();
        animal2.makeASound();
    }
}
