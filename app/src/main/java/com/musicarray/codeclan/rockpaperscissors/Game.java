package com.musicarray.codeclan.rockpaperscissors;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 12/20/17.
 */

public class Game {

    private String playerChoice;
    private String computerChoice;
    private ArrayList<String> answers;

    public Game() {
        this.playerChoice = playerChoice;
        this.computerChoice = computerChoice;
        this.answers = new ArrayList<>();
        answers.add("Rock");
        answers.add("Paper");
        answers.add("Scissors");
    }

    public String getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice(String playerChoice) {
        this.playerChoice = playerChoice;
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    public void setComputerChoice(String computerChoice) {
        this.computerChoice = computerChoice;
    }

    public void playerChoiceRock(){
        this.playerChoice = answers.get(0);
    }

    public void playerChoiceScissors(){
        this.playerChoice = answers.get(2);
    }

    public void playerChoicePaper(){
        this.playerChoice = answers.get(1);
    }

    public void computerChoice(){
        Collections.shuffle(this.answers);
        this.computerChoice = this.answers.get(0);
    }

    public String findWinner(String playerChoice, String computerChoice){
        String result = new String();
        if (playerChoice == "Rock" && computerChoice == "Scissors"){
            result = "Player wins";
        }
         return result;

    }


//    if (hand1 == "rock" && hand2 == "scissors") ||
//            (hand1 == "paper" && hand2 == "rock") ||
//            (hand1 == "scissors" && hand2 == "paper")
//    winner = player1
//    elsif (hand1 == "rock" && hand2 == "paper") ||
//            (hand1 == "paper" && hand2 == "scissors") ||
//            (hand1 == "scissors" && hand2 == "rock")
//    winner = player2
//            end
}







