package com.company.StructuralPatterns.AdapterPatternChallenge;

import java.util.ArrayList;
import java.util.List;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String audioType, String filename) {
        List<String> knownTypes = new ArrayList<>(List.of("mp3", "vlc", "mp4"));

        if (!knownTypes.contains(audioType.toLowerCase())) {
            System.out.println("Unknown file format: " + audioType);
        } else {
            advancedMediaPlayer.loadFilename(filename);
            advancedMediaPlayer.listen();
        }
    }
}
