/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex38;

import java.util.ArrayList;
import java.util.Scanner;

public class FilterVals
{
    public static void main(String[] args)
    {
        Scanner scan;
        String input;
        String[] numsAsStrings;

        System.out.println("Enter a list of numbers, separated by spaces:");
        scan = new Scanner(System.in);
        input = scan.nextLine();

        numsAsStrings = input.split(" ");
        int[] nums = new int[numsAsStrings.length];

        for(int i = 0; i < numsAsStrings.length; i++)
            nums[i] = Integer.parseInt(numsAsStrings[i]);

        ArrayList<Integer> newNums = filterEvenNumbers(nums);

        System.out.format("The numbers are");

        for(int i = 0; i < newNums.size(); i++)
            System.out.format(" %d", newNums.get(i));

        System.out.format(".");
    }

    public static ArrayList<Integer> filterEvenNumbers(int[] values)
    {
        ArrayList<Integer> retVal = new ArrayList<Integer>();

        for(int value : values)
        {
            if(value % 2 == 0)
                retVal.add(value);
        }

        return retVal;
    }
}
