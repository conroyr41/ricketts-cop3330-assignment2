/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex34;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ListRemoval
{
    public static void main(String[] args)
    {
        Scanner scan;
        ArrayList<String> employees = new ArrayList<String>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        String employeeToDelete;

        displayEmployees(employees);

        System.out.println("\nEnter an employee name to remove:");
        scan = new Scanner(System.in);
        employeeToDelete = scan.nextLine();

        employees.remove(employeeToDelete);

        displayEmployees(employees);
    }

    public static int displayEmployees(ArrayList<String> listOfEmployees)
    {
        System.out.printf("There are %d employees:%n", listOfEmployees.size());

        for (String name : listOfEmployees) System.out.println(name);

        //1 indicates successful completion.
        return 1;
    }
}
