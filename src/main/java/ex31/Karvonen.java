/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex31;

import java.util.Scanner;

public class Karvonen
{
    public static void main(String[] args)
    {
        Scanner scan;
        double age = 0, restingHeartRate = 0;
        StringBuilder stringBuilder = new StringBuilder();

        while(age == 0 && restingHeartRate == 0)
        {
            try
            {
                System.out.println("Enter your age:");
                scan = new Scanner(System.in);
                age = Double.parseDouble(scan.next());

                System.out.println("Enter your resting heart rate:");
                scan = new Scanner(System.in);
                restingHeartRate = Double.parseDouble(scan.next());

            }
            catch(Exception e)
            {
                System.out.println("Please enter numbers.");
            }
        }

        stringBuilder.append(String.format("Resting Pulse: %.0f        Age: %.0f\n\nIntensity     | Rate\n--------------|----------", restingHeartRate, age));

        for(int intensity = 55; intensity <= 95; intensity += 5)
            stringBuilder.append(String.format("\n%d%%           | %.0f bpm", intensity, getTargetHeartRate(age, restingHeartRate, intensity)));

        System.out.println(stringBuilder.toString());
    }

    public static double getTargetHeartRate(double age, double restingHeartRate, double intensity)
    {
        //TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
        return ( (((220.0 - age) - restingHeartRate) * (intensity/100)) + restingHeartRate );
    }
}
