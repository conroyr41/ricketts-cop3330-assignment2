/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex27;

import java.util.Scanner;
import java.util.regex.*;

public class InputValidator
{
    public static void main(String[] args)
    {
        Scanner scan;
        String firstName, lastName, zipCode, employeeID, output;

        System.out.println("Enter the first name:");
        scan = new Scanner(System.in);
        firstName = scan.next();

        System.out.println("Enter the last name:");
        scan = new Scanner(System.in);
        lastName = scan.next();

        System.out.println("Enter the ZIP code:");
        scan = new Scanner(System.in);
        zipCode = scan.next();

        System.out.println("Enter the employee ID:");
        scan = new Scanner(System.in);
        employeeID = scan.next();

        output = String.format("%s%s%s%s", validateFirstName(firstName), validateLastName(lastName), validateZipCode(zipCode), validateEmployeeID(employeeID));

        if(validateFirstName(firstName) == "" && validateLastName(lastName) == "" && validateZipCode(zipCode) == "" && validateEmployeeID(employeeID) == "")
            output = "There were no errors found.";

        System.out.println(output);
    }

    public static String validateFirstName(String name)
    {
        if(name.isBlank() || name.isEmpty())
            return "The first name must be filled in.\n";

        if(name.length() < 2)
            return "The first name must be at least two characters long.\n";

        //An empty string indicates a successful validation.
        return "";
    }

    public static String validateLastName(String name)
    {
        if(name.isBlank() || name.isEmpty())
            return "The last name must be filled in.\n";

        if(name.length() < 2)
            return "The last name must be at least two characters long.\n";

        //An empty string indicates a successful validation.
        return "";
    }

    public static String validateZipCode(String zip)
    {
        if(!zip.matches("[0-9]{5}"))
            return "The zipcode must be a 5 digit number.\n";

        //An empty string indicates a successful validation.
        return "";
    }

    public static String validateEmployeeID(String ID)
    {
        if(!ID.matches("[a-zA-Z]{2}-[0-9]{4}"))
            return "The employee ID must be in the format of AA-1234.\n";

        //An empty string indicates a successful validation.
        return "";
    }
}
