/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex29;

import java.util.Scanner;

public class Rule72
{
    public static void main(String[] args)
    {
        Scanner scan;
        double rate = 0;
        String output;
        int years;

        while (rate == 0)
        {
            try
            {
                System.out.println("What is the rate of return?");
                scan = new Scanner(System.in);
                rate = Double.parseDouble(scan.next());

                if (rate == 0)
                    System.out.println("Sorry. That's not a valid input.");
            }
            catch (Exception e)
            {
                System.out.println("Sorry. That's not a valid input.");
            }
        }

        years = getYears(rate);
        output = String.format("It will take %d years to double your initial investment.", years);
        System.out.println(output);
    }

    public static int getYears(double rateOfReturn)
    {
        return (int)(72/rateOfReturn);
    }
}