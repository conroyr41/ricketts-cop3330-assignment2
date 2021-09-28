/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex33;

import java.util.Random;
import java.util.Scanner;

public class EightBall
{
    public static String[] responses = {"Yes", "No", "Maybe", "Ask again later."};

    public static void main(String[] args)
    {
        Scanner scan;
        String output;

        System.out.println("What's your question?");
        scan = new Scanner(System.in);
        scan.next();

        output = getResponse(responses);

        System.out.println(output);
    }

    public static String getResponse(String[] messages)
    {
        Random random = new Random();
        return messages[random.nextInt(4)];
    }
}
