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
        assertEquals( Choice.ROCK, game.getPlayerChoice());
    }

    @Test
    public void canGetScissors(){
        game.playerChoiceScissors();
        assertEquals(Choice.SCISSORS, game.getPlayerChoice());
    }

    @Test
    public void canGetPaper(){
        game.playerChoicePaper();
        assertEquals(Choice.PAPER, game.getPlayerChoice());
    }

    @Test
    public void canGetRandomComputerChoice(){
        game.computerChoice();
        assertNotNull(game.getComputerChoice());
    }

    @Test
    public void playerWinsWithScissors(){
        game.playerChoiceScissors();
        game.setComputerChoice(Choice.PAPER);
        assertEquals("The computer chose: Paper\n" +
                "You win!", game.findWinner(game.getPlayerChoice(), game.getComputerChoice()));
    }

    @Test
    public void playerWinsWithScissors_ScoreTest(){
        game.playerChoiceScissors();
        game.setComputerChoice(Choice.PAPER);
        game.findWinner(game.getPlayerChoice(), game.getComputerChoice());
        Integer result = 1;
        assertEquals(result, game.getPlayerScore());
        game.playerChoiceScissors();
        game.setComputerChoice(Choice.PAPER);
        game.findWinner(game.getPlayerChoice(), game.getComputerChoice());
        Integer result2 = 2;
        assertEquals(result2, game.getPlayerScore());
    }

    @Test
    public void playerWinsWithRock(){
        game.playerChoiceRock();
        game.setComputerChoice(Choice.SCISSORS);
        assertEquals("The computer chose: Scissors\n" +
                "You win!", game.findWinner(game.getPlayerChoice(), game.getComputerChoice()));
    }


    @Test
    public void playerWinsWithPaper(){
        game.playerChoicePaper();
        game.setComputerChoice(Choice.ROCK);
        assertEquals("The computer chose: Rock\n" +
                "You win!", game.findWinner(game.getPlayerChoice(), game.getComputerChoice()));
    }

    @Test
    public void itsADraw(){
        game.playerChoicePaper();
        game.setComputerChoice(Choice.PAPER);
        assertEquals("The computer chose: Paper\n" + "It's a draw", game.findWinner(game.getPlayerChoice(), game.getComputerChoice()));
    }
//
//    @Test
//    public void computerWinsWithRock(){
//        game.playerChoiceScissors();
//        game.setComputerChoice("Rock");
//        assertEquals("The computer chose: Rock\n" +
//                "You lose!", game.findWinner(game.getPlayerChoice(), game.getComputerChoice()));
//    }
//
//    @Test
//    public void generateWinnerRock(){
//        assertNotNull(game.generateWinnerRock());
//    }

//    @Test
//    public void generateWinnerPaper(){
//        assertEquals();
//    }

}
