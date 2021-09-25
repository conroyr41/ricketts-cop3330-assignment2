/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Rule72Test
{
    @Test
    public void getYears_rateIs4_18()
    {
        Rule72 rule72 = new Rule72();
        Assertions.assertEquals(18, rule72.getYears(4.0));
    }
}
