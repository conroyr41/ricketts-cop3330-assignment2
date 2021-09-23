/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex24;

import java.util.Scanner;

public class Anagram
{
    public static void main(String[] args)
    {
        Scanner scan;
        String firstString, secondString, output;

        System.out.println("Enter two strings and I'll tell you if they are anagrams!\nFirst enter your first string:");
        scan = new Scanner(System.in);
        firstString = scan.next();

        System.out.println("Now enter your second string:");
        scan = new Scanner(System.in);
        secondString = scan.next();

        output = String.format("\"%s\" and \"%s\" are%s anagrams!", firstString, secondString, isAnagram(firstString, secondString) ? "" : " not");
        System.out.println(output);
    }

    public static boolean isAnagram(String string1, String string2)
    {
        boolean matchFound;

        if(string1.length() != string2.length())
            return false;

        for(int i = 0; i < string1.length(); i++)
        {
            matchFound = false;

            for(int j = 0; j < string2.length(); j++)
            {
                if(string1.charAt(i) == string2.charAt(j))
                {
                    matchFound = true;
                    break;
                }
            }

            if(!matchFound)
                return false;
        }

        return true;
    }
}
