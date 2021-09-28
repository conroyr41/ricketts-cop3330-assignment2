/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex36;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StatsTest
{
    @Test
    public void getAvg_123_2()
    {
        ArrayList<Double> testList = new ArrayList<Double>();
        testList.add(1.0);
        testList.add(2.0);
        testList.add(3.0);

        Double result;

        Stats stats = new Stats();
        result = stats.getAvg(testList);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void getMin_123_1()
    {
        ArrayList<Double> testList = new ArrayList<Double>();
        testList.add(1.0);
        testList.add(2.0);
        testList.add(3.0);

        Double result;

        Stats stats = new Stats();
        result = stats.getMin(testList);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void getMax_123_3()
    {
        ArrayList<Double> testList = new ArrayList<Double>();
        testList.add(1.0);
        testList.add(2.0);
        testList.add(3.0);

        Double result;

        Stats stats = new Stats();
        result = stats.getMax(testList);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void getStd_123_816496580927726()
    {
        ArrayList<Double> testList = new ArrayList<Double>();
        testList.add(1.0);
        testList.add(2.0);
        testList.add(3.0);

        Double result;

        Stats stats = new Stats();
        result = stats.getStd(testList);
        Assertions.assertEquals(0.816496580927726, result);
    }
}
