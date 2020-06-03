package com.company.StructuralPatterns.AdapterPatternChallenge;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String filename) {
        if (!audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Unknown file format: " + audioType);
        } else {
            System.out.println("Playing " + audioType + " file. Name: " + filename);
        }
    }
}
