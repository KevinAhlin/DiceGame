package com.kevin.DiceGame;

import org.junit.Test;
import static org.junit.Assert.*;

public class DiceTest {

    Dice dice = new Dice(1,true);
    Player playerList = new Player();

    @Test
    public void diceEqualsOne() {
        assertEquals(1,dice.sides);
    }

    @Test
    public void checkIf_returns_numPLayers() {
        assertTrue(dice.playingGame);
    }

    String[] numPlayers = {"Player 1", "Player 2", "Player 3"};
    @Test
    public void checkIf_returns_ansList() {
        assertArrayEquals(numPlayers, playerList.listOfPlayers(3));
    }

}