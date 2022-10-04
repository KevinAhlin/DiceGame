package com.kevin.DiceGame;

public class Player {

    // A method that creates an array of the number of player that plays the game
    public String[] listOfPlayers(int players) {

        String[] numPlayers = new String[players];

        // Loop for adding the players into the list numPlayers
        for (int i = 0; i < players; i++) {
            numPlayers[i] = ("Player " + (i+1));
        }

        return numPlayers;

    }
}
