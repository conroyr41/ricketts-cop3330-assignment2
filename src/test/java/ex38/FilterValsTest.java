/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */


package ex38;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class FilterValsTest
{
    @Test
    public void filterEvenNumbers_123456_246()
    {
        int[] testList = {1,2,3,4,5,6};

        ArrayList<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(6);

        FilterVals filterVals = new FilterVals();
        Assertions.assertEquals(expectedList, filterVals.filterEvenNumbers(testList));
    }
}
