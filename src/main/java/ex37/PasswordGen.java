/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex37;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PasswordGen
{
    public static void main(String[] args)
    {
        Scanner scan;
        int minLength, specialChars, nums;
        String password;

        System.out.println("What's the minimum length?");
        scan = new Scanner(System.in);
        minLength = Integer.parseInt(scan.next());

        System.out.println("How many special characters?");
        scan = new Scanner(System.in);
        specialChars = Integer.parseInt(scan.next());

        System.out.println("How many numbers");
        scan = new Scanner(System.in);
        nums = Integer.parseInt(scan.next());

        password = generatePassword(minLength, specialChars, nums);

        System.out.format("Your password is %s", password);
    }

    public static String generatePassword(int minimumLength, int numOfSpecialCharacters, int numOfNumbers)
    {
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialChars = "!@#$%&*()_+-=[]|,./?><";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Character> pass = new ArrayList<Character>();

        for(int i = 0; i < minimumLength; i++)
            stringBuilder.append(letters.charAt(random.nextInt(letters.length() - 1)));

        for(int i = 0; i < numOfSpecialCharacters; i++)
            stringBuilder.append(specialChars.charAt(random.nextInt(letters.length() - 1)));

        for(int i = 0; i < numOfNumbers; i++)
            stringBuilder.append(numbers.charAt(random.nextInt(letters.length() - 1)));

        return stringBuilder.toString();
    }
}
