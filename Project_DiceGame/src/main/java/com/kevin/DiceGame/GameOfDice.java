package com.kevin.DiceGame;

import java.util.Arrays;

public class GameOfDice {

    //Instantiate objects
    Dice gameDie = new Dice(6,true);
    GameScanner gameScanner = new GameScanner();
    Player dicePlayers = new Player();

    // Method for playing the dice game a number of times
    public void playingDiceGame() {

        // While-loop that contains the code which runs the dice game
        while (gameDie.playingGame) {

            // Calling for the different variables from the scanner class
            gameScanner.inputScanner();
            int rounds = gameScanner.ansList[0];
            int diceThrows = gameScanner.ansList[1];
            int players = gameScanner.ansList[2];

            String[] listOfPlayers = dicePlayers.listOfPlayers(players);        // Returns a list of players
            int[] playerScores = new int[listOfPlayers.length];

            System.out.println("PLayers: " + Arrays.toString(listOfPlayers));

            // For-loop for handling the rounds
            for (int i = 0; i < rounds; i++) {
                System.out.println("\nRound: " + (i+1));

                // Nested for-loop to go through the list of players
                for (int j = 0; j < players; j++) {

                    int playerSum = 0;
                    System.out.println("Player " + (j+1) + " turn");

                    // Nested for-loop for throwing each die
                    for (int k = 0; k < diceThrows; k++) {

                        int playerThrow = gameDie.throwDice();
                        System.out.println("You rolled: " + playerThrow);
                        playerSum += playerThrow;
                    }

                    System.out.println("Player " + (j+1) + "; " + "Total score: " + playerSum + "\n");     // Prints out the sum for every player that round
                    playerScores[j] = playerSum;

                }

                System.out.println("Players scores: " + Arrays.toString(playerScores));

                // For-each loop to decide the highest score
                int highestScore = 0;
                for (int score : playerScores) {

                    if (score > highestScore) {
                        highestScore = score;
                    }
                }

                // Loop to check which player had the highest score and is thereby the winner
                for (int j = 0; j < listOfPlayers.length; j++) {

                    if (highestScore == playerScores[j]) {
                        System.out.println("Winner of the round: " + listOfPlayers[j] + ", with " + highestScore);
                    }

                }
            }

            gameDie.playingGame = gameScanner.repeatGame();     // Handle weather you want to play again or not

        }
        System.out.println("Game Over");
    }
}
