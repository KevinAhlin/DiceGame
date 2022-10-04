package com.kevin.DiceGame;

import java.util.Random;

public class Dice {
    int sides;
    boolean playingGame;

    public Dice(int sides, boolean playingGame) {
        this.sides = sides;
        this.playingGame = playingGame;
    }

    public int throwDice() {
        int diceThrow;
        Random ranNum = new Random();
        diceThrow = ranNum.nextInt(1, sides + 1);      // Choosing a random number for the die

        return diceThrow;
    }
}
