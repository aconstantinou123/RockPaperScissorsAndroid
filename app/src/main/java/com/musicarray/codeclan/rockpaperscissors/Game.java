package com.musicarray.codeclan.rockpaperscissors;

import android.content.Intent;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by user on 12/20/17.
 */

public class Game implements Serializable {

    private Choice playerChoice;
    private Choice computerChoice;
    private Integer playerScore;
    private Integer computerScore;

    public Game() {
        this.playerChoice = playerChoice;
        this.computerChoice = computerChoice;
        this.playerScore = 0;
        this.computerScore = 0;
    }

    public Choice getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice(Choice playerChoice) {
        this.playerChoice = playerChoice;
    }

    public Choice getComputerChoice() {
        return computerChoice;
    }

    public void setComputerChoice(Choice computerChoice) {
        this.computerChoice = computerChoice;
    }

    public Choice playerChoiceRock() {
        return playerChoice = Choice.ROCK;
    }

    public Choice playerChoiceScissors() {
        return playerChoice = Choice.SCISSORS;
    }

    public Choice playerChoicePaper() {
        return playerChoice = Choice.PAPER;
    }

    public Integer getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(Integer playerScore) {
        this.playerScore = playerScore;
    }

    public Integer getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(Integer computerScore) {
        this.computerScore = computerScore;
    }

    public Choice computerChoice() {
        Random random = new Random();
        int randomChoice = random.nextInt(3) + 0;
        ArrayList<Choice> choices = new ArrayList<>();
        choices.add(Choice.PAPER);
        choices.add(Choice.ROCK);
        choices.add(Choice.SCISSORS);
        return this.computerChoice = choices.get(randomChoice);
    }

    public String findWinner(Choice playerChoice, Choice computerChoice) {
        String result = new String();
        if (playerChoice == computerChoice) {
            return "The computer chose: " + computerChoice.getChoiceString() + "\n" + "It's a draw";
        }
        if (playerChoice == Choice.ROCK && computerChoice == Choice.SCISSORS ||
                playerChoice == Choice.PAPER && computerChoice == Choice.ROCK ||
                playerChoice == Choice.SCISSORS && computerChoice == Choice.PAPER) {
            result = "The computer chose: " + getComputerChoice().getChoiceString() + "\n"
                    + "You win!";
            playerScore += 1;
        } else if (playerChoice == Choice.ROCK && computerChoice == Choice.PAPER ||
                playerChoice == Choice.PAPER && computerChoice == Choice.SCISSORS ||
                playerChoice == Choice.SCISSORS && computerChoice == Choice.ROCK) {
            result = "The computer chose: " + getComputerChoice().getChoiceString() + "\n"
                    + "You lose!";
            computerScore += 1;
        }
        return result;
//
    }

    public String generateWinner() {
        return findWinner(this.playerChoice, computerChoice());
    }

    public String generateWinnerPaper() {
        return findWinner(playerChoicePaper(), computerChoice());
    }

    public String generateWinnerScissors() {
        return findWinner(playerChoiceScissors(), computerChoice());
    }
}








