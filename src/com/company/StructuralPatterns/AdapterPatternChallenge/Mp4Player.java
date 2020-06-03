package com.company.StructuralPatterns.AdapterPatternChallenge;

public class Mp4Player implements AdvancedMediaPlayer {
    private String filename;

    @Override
    public void loadFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing mp4 file. Name: " + filename);
    }
}
