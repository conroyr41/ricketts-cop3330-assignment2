/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex35;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Objects;

public class WinnerPickerTest
{
    @Test
    public void pickAWinner_GivenMeAndYou_OnlyMeOrYou()
    {
        ArrayList<String> testList = new ArrayList<String>();
        testList.add("Me");
        testList.add("You");

        String winner;

        WinnerPicker winnerPicker = new WinnerPicker();
        winner = winnerPicker.pickAWinner(testList);
        Assertions.assertTrue(Objects.equals(winner, "Me") || Objects.equals(winner, "You"));
    }
}
