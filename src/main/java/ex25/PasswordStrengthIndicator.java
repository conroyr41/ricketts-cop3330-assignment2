/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex25;

import java.util.Scanner;

public class PasswordStrengthIndicator
{
    public static void main(String[] args)
    {
        Scanner scan;
        String password, output = "";

        System.out.println("Enter a password and I will tell you how strong it is!");
        scan = new Scanner(System.in);
        password = scan.next();

        switch (passwordValidator(password)) {
            case 1 -> output = "Your password is very weak. Please consider changing it.";
            case 2 -> output = "Your password is weak. Please consider changing it.";
            case 3 -> output = "Your password is strong.";
            case 4 -> output = "Your password is very strong.";
        }

        System.out.println(output);
    }

    public static int passwordValidator(String password)
    {
        /*
        A very weak password contains only numbers and is fewer than eight characters.
        A weak password contains only letters and is fewer than eight characters.
        A strong password contains letters and at least one number and is at least eight characters.
        A very strong password contains letters, numbers, and special characters and is at least eight characters.

        1 indicates a very weak password.
        2 indicates a weak password.
        3 indicates a strong password.
        4 indicates a very strong password.
        */

        if(password.length() < 8 && password.matches("[0-9]+"))
            return 1;
        if(password.length() < 8 && password.matches("[a-zA-Z]+"))
            return 2;
        if(password.length() < 8)
            return 2;

        if(password.length() >= 8)
        {
            char ch;
            boolean containsDigit = false;
            boolean containsOnlyLettersOrDigits = true;

            for(int i = 0; i < password.length(); i++)
            {
                ch = password.charAt(i);

                if(Character.isDigit(ch))
                {
                    containsDigit = true;
                    continue;
                }

                if(!Character.isLetter(ch))
                {
                    containsOnlyLettersOrDigits = false;
                    break;
                }
            }

            if(containsDigit && containsOnlyLettersOrDigits)
                return 3;
        }

        //At this point, the password has to be a very strong password.
        return 4;
    }
}

