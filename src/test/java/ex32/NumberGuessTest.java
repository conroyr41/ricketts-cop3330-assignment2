/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex32;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberGuessTest
{
    @Test
    public void getRandomNumber_Difficulty1_NumberBetween1And10Inclusive()
    {
        NumberGuess numberGuess = new NumberGuess();
        int computerGuess = numberGuess.getRandomNumber(1);
        Assertions.assertTrue(computerGuess >= 1 && computerGuess <= 10);
    }

    @Test
    public void getRandomNumber_Difficulty2_NumberBetween1And100Inclusive()
    {
        NumberGuess numberGuess = new NumberGuess();
        int computerGuess = numberGuess.getRandomNumber(2);
        Assertions.assertTrue(computerGuess >= 1 && computerGuess <= 100);
    }

    @Test
    public void getRandomNumber_Difficulty3_NumberBetween1And1000Inclusive()
    {
        NumberGuess numberGuess = new NumberGuess();
        int computerGuess = numberGuess.getRandomNumber(3);
        Assertions.assertTrue(computerGuess >= 1 && computerGuess <= 1000);
    }
}
