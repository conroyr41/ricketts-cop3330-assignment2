/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex28;

import java.util.Scanner;

public class Addition
{
    public static void main(String[] args)
    {
        Scanner scan;
        String output;
        double[] nums = new double[5];
        double total;

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter a number:");
            scan = new Scanner(System.in);
            nums[i] = Double.parseDouble(scan.next());
        }

        total = calculateTotal(nums);
        output = String.format("The total is %f.", total);

        System.out.println(output);
    }

    public static double calculateTotal(double[] values)
    {
        double retVal = 0;

        for(double value : values)
            retVal += value;

        return retVal;
    }
}
