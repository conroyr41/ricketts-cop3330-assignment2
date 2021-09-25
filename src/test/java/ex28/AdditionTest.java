/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdditionTest
{
    @Test
    public void calculateTotal_GivenExampleValues_15()
    {
        Addition addition = new Addition();
        Assertions.assertEquals(15, addition.calculateTotal(new double[]{1, 2, 3, 4, 5}));
    }
}
