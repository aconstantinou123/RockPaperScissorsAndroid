package com.musicarray.codeclan.rockpaperscissors;

/**
 * Created by user on 12/20/17.
 */

public enum Choice {
    ROCK ("Rock"),
    PAPER ("Paper"),
    SCISSORS ("Scissors");

    final String choiceString;


    Choice(String choiceString) {
        this.choiceString = choiceString;
    }

    public String getChoiceString() {
        return choiceString;
    }
}
