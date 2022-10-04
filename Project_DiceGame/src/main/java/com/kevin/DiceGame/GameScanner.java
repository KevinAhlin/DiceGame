package com.kevin.DiceGame;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class GameScanner {

    // Instantiate object
    Scanner scanner = new Scanner(System.in);

    int[] ansList = new int[3];         // List for the user-input
    public int[] inputScanner() {
        // Three do-while loops with try-catch to handle input errors.

        int rounds;
        boolean repeatRound;

        do {
            repeatRound = false;
            try {
                System.out.println("How many rounds would you like to play? ");
                rounds = scanner.nextInt();
                System.out.println("You chose: " + rounds + " rounds.");
                ansList[0] = rounds;

            } catch (InputMismatchException e) {
                System.out.println("Only integers are allowed. Try again.");
                repeatRound = true;
                scanner.nextLine();         // So the program redo the loop
            }

        } while (repeatRound);

        int diceThrows;
        boolean repeatThrow;

        do {
            repeatThrow = false;
            try {
                System.out.println("Type in how many dice you want to throw: ");
                diceThrows = scanner.nextInt();
                System.out.println("Number of dice thrown: " + diceThrows);
                ansList[1] = diceThrows;

            } catch (InputMismatchException e) {
                System.out.println("Only integers are allowed. Try again.");
                repeatThrow = true;
                scanner.nextLine();             // So the program redo the loop
            }

        } while (repeatThrow);

        int players;
        boolean repeatPlayers;

        do {
            repeatPlayers = false;
            try {
                System.out.println("How many players will there be?");
                players = scanner.nextInt();
                System.out.println("Number of players: " + players);
                ansList[2] = players;

            } catch (InputMismatchException e) {
                System.out.println("Only integers are allowed. Try again.");
                repeatPlayers = true;
                scanner.nextLine();             // So the program redo the loop
            }

        } while (repeatPlayers);

        return ansList;

    }

    public boolean repeatGame() {
        // Asks if you would like to play again and exits the while-loop otherwise

        String playAgain;
        boolean repeat;
        boolean play = false;

        do {
            repeat = false;
            try {
                System.out.println("Would you like to play again? Press 'y' for yes or 'n' for no.");
                playAgain = scanner.next();
                play = Objects.equals(playAgain, "y");
                if (!playAgain.equals("y") && !playAgain.equals("n")) {     // Checks if playAgain is neither 'y' nor 'n'
                    throw new Exception("Wrong input.");
                }

            } catch (Exception e) {
                System.out.println("Please input 'y' or 'n'.");
                repeat = true;
            }

        } while (repeat);

        return play;

    }
}
