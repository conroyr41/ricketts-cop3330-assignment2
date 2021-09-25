/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex30;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        int tableSize = 12;
        createTable(tableSize);
    }

    public static int createTable(int size)
    {
        for(int i = 1; i <= size; i++)
        {
            for(int j = 1; j <= size; j++)
            {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }

        //1 indicates successful completion
        return 1;
    }
}
