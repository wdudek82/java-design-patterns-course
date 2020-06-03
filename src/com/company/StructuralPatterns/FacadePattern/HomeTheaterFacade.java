package com.company.StructuralPatterns.FacadePattern;

public class HomeTheaterFacade {
    Amplifier amplifier;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights theaterLights;
    Screen screen;
    PopcornPopper popcornPopper;

    // TODO: replace this abomination with using Builder Pattern
    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector, TheaterLights theaterLights, Screen screen, PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");

        popcornPopper.on();
        popcornPopper.pop();

        theaterLights.dim(10);
        screen.down();

        projector.on();
        projector.wideScreenMode();

        amplifier.on();
        amplifier.setDvd(dvd);
        amplifier.setStereoSound();
        amplifier.setVolume(5);

        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popcornPopper.off();
        theaterLights.off();
        screen.up();
        projector.off();
        amplifier.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
