package com.company.BehavioralPatterns.FlyweightPatternChallenge;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {
    private final Map<PlayerType, Player> players;

    public PlayerFactory() {
        this.players = new HashMap<>();
    }

    public Player getPlayer(PlayerType type) {
        Player player = players.get(type);

        if (player != null) {
            return player;
        }

        player = switch (type) {
            case TERRORIST -> new Terrorist();
            case COUNTER_TERRORIST -> new CounterTerrorist();
        };

        players.put(type, player);

        return player;
    }
}
