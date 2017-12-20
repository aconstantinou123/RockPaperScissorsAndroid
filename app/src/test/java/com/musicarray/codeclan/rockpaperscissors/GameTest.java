package com.musicarray.codeclan.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by user on 12/20/17.
 */

public class GameTest {

    Game game;

    @Before
    public void before(){
        game = new Game();

    }

    @Test
    public void canGetRock(){
        game.playerChoiceRock();
        assertEquals("Rock", game.getPlayerChoice());
    }

    @Test
    public void canGetScissors(){
        game.playerChoiceScissors();
        assertEquals("Scissors", game.getPlayerChoice());
    }

    @Test
    public void canGetPaper(){
        game.playerChoicePaper();
        assertEquals("Paper", game.getPlayerChoice());
    }

    @Test
    public void canGetRandomComputerChoice(){
        game.computerChoice();
        assertNotNull(game.getComputerChoice());
    }

    @Test
    public void playerWinsWithRock(){
        game.playerChoiceRock();
        game.setComputerChoice("Scissors");
        assertEquals("Player wins", game.findWinner(game.getPlayerChoice(), game.getComputerChoice()));
    }

}
