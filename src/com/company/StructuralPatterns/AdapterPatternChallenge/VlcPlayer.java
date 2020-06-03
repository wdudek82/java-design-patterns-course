package com.company.StructuralPatterns.AdapterPatternChallenge;

public class VlcPlayer implements AdvancedMediaPlayer {
    private String filename;

    @Override
    public void loadFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing vlc file. Name: " + filename);
    }
}
