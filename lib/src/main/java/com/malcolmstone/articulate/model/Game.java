package com.malcolmstone.articulate.model;

/**
 * Created by malcolm on 04/11/15.
 */
public class Game {
    private Team[] teams;
    private Integer numberOfRounds;

    public Game(Team[] teams, Integer numberOfRounds) {
        this.teams = teams;
        this.numberOfRounds = numberOfRounds;
    }
}
