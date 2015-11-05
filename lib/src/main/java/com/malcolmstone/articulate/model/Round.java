package com.malcolmstone.articulate.model;

/**
 * Created by malcolm on 04/11/15.
 */
public class Round {
    private Card[] cards;
    private Player player;

    public Round(Card[] cards, Player player) {
        this.cards = cards;
        this.player = player;
    }
}
