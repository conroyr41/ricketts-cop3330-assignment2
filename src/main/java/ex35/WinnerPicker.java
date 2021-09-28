/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex35;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class WinnerPicker
{
    public static void main(String[] args)
    {
        Scanner scan;
        ArrayList<String> names = new ArrayList<String>();
        String input = "Placeholder", winner;

        while(!Objects.equals(input, ""))
        {
            System.out.println("Enter a name:");
            scan = new Scanner(System.in);
            input = scan.nextLine();

            names.add(input);
        }

        winner = pickAWinner(names);

        System.out.printf("%s is the winner!", winner);
    }

    public static String pickAWinner(ArrayList<String> possibleWinners)
    {
        Random random = new Random();

        //We subtract one to not include the "" input.
        return possibleWinners.get(random.nextInt(possibleWinners.size() - 1));
    }
}
