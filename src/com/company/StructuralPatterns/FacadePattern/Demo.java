package com.company.StructuralPatterns.FacadePattern;

import com.company.StructuralPatterns.FacadePatternChallenge.HotelKeeper;
import com.company.StructuralPatterns.FacadePatternChallenge.Menus;

public class Demo {
    public static void run() {
        Amplifier amplifier = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("Tuner", amplifier);
        DvdPlayer dvd = new DvdPlayer("DvdPlayer", amplifier);
        CdPlayer cd = new CdPlayer("CdPlayer", amplifier);
        Projector projector = new Projector("Projector", dvd);
        TheaterLights theaterLights = new TheaterLights("TheaterLights");
        Screen screen = new Screen("Screen");
        PopcornPopper popcornPopper = new PopcornPopper("Popcorn popper");

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(
                amplifier, tuner, dvd, cd, projector, theaterLights, screen, popcornPopper
        );

        homeTheaterFacade.watchMovie("Interview with the Vampire");
        homeTheaterFacade.endMovie();
    }

    public static void runChallenge() {
        HotelKeeper keeper = new HotelKeeper();

        Menus vegMenu = keeper.getVeganMenu();
        Menus nonVeganMenu = keeper.getNonVeganMenu();

        vegMenu.showMenu();
        nonVeganMenu.showMenu();
    }
}
