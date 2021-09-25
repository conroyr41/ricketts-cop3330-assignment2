/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex32;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess
{
    public static void main(String[] args)
    {
        Scanner scan;
        int difficulty = 0, computerGuess, playerGuess = -1, numberOfGuesses = 1;

        System.out.println("Let's play Guess the Number!");

        while(difficulty == 0)
        {
            try
            {
                System.out.println("Enter the difficulty level (1, 2, or 3):");
                scan = new Scanner(System.in);
                difficulty = Integer.parseInt(scan.next());
            }
            catch(Exception e)
            {
                System.out.println("Please enter a number!");
            }
        }

        computerGuess = getRandomNumber(difficulty);
        System.out.println("I have my number. What's your guess?");

        while(playerGuess == -1)
        {
            try
            {
                scan = new Scanner(System.in);
                playerGuess = Integer.parseInt(scan.next());

                if(playerGuess < computerGuess)
                {
                    System.out.println("Too low. Guess again:");
                    playerGuess = -1;
                    numberOfGuesses++;
                }
                else if(playerGuess == computerGuess)
                {
                    System.out.println(String.format("You got it in %d guesses!", numberOfGuesses));
                    System.exit(0);
                }
                else if(playerGuess > computerGuess)
                {
                    System.out.println("Too high. Guess again:");
                    playerGuess = -1;
                    numberOfGuesses++;
                }
            }
            catch(Exception e)
            {
                System.out.println("Please enter a number!");
                playerGuess = -1;
                numberOfGuesses++;
            }
        }

    }

    public static int getRandomNumber(int difficultyLevel)
    {
        Random random = new Random();

        switch(difficultyLevel)
        {
            case 1:
                return random.nextInt(10) + 1;
            case 2:
                return random.nextInt(100) + 1;
            case 3:
                return random.nextInt(1000) + 1;
        }

        return 0;
    }
}
