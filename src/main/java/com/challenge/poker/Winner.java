package com.challenge.poker;

import java.util.Objects;

import com.challenge.poker.rank.Rank;

public class Winner implements GameResult {
    private final Player player;

    public Winner(Player player) {
        this.player = player;
    }

    public Rank rank() {
        return new GameRules().evaluate(player.hand);
    }

    public String playerName() {
        return player.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Winner that = (Winner) o;
        return Objects.equals(player, that.player);
    }

    @Override
    public String toString() {
        return playerName() + " with " + rank() + " " + player.hand;
    }
}
