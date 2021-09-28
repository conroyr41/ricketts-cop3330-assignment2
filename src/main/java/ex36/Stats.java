/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex36;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Stats
{
    public static void main(String[] args)
    {
        Scanner scan;
        ArrayList<Double> values = new ArrayList<Double>();
        String input = "Placeholder";
        Double average, minimum, maximum, standardDeviation;

        while(!Objects.equals(input, "done"))
        {
            try
            {
                System.out.println("Enter a number:");
                scan = new Scanner(System.in);
                input = scan.nextLine();

                if(!Objects.equals(input, "done"))
                    values.add(Double.parseDouble(input));
            }
            catch(Exception e)
            {
                System.out.println("Enter a number or \"done\".");
            }
        }

        System.out.print("Numbers: ");
        for (Double value : values) System.out.format("%f ", value);

        average = getAvg(values);
        minimum = getMin(values);
        maximum = getMax(values);
        standardDeviation = getStd(values);

        System.out.printf("\nThe average is %f\nThe minimum is %f\nThe maximum is %f\nThe standard deviation is %f", average, minimum, maximum, standardDeviation);
    }

    public static Double getAvg(ArrayList<Double> values)
    {
        Double sum = 0.0;

        for(Double value : values)
        {
            sum += value;
        }

        return sum/values.size();
    }

    public static Double getMin(ArrayList<Double> values)
    {
        Double min = Double.MAX_VALUE;

        for(Double value : values)
        {
            if(value < min)
                min = value;
        }

        return min;
    }

    public static Double getMax(ArrayList<Double> values)
    {
        Double max = Double.MIN_VALUE;

        for(Double value : values)
        {
            if(value > max)
                max = value;
        }

        return max;
    }

    public static Double getStd(ArrayList<Double> values)
    {
        double mean = getAvg(values);
        double temp = 0.0;

        for (double val : values)
        {
            double squareDiffToMean = Math.pow(val - mean, 2);

            temp += squareDiffToMean;
        }

        double meanOfDiffs = temp / values.size();

        return Math.sqrt(meanOfDiffs);
    }
}
