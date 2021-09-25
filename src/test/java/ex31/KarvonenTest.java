/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex31;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KarvonenTest
{
    @Test
    public void getTargetHeartRate_GivenTest_138()
    {
        Karvonen karvonen = new Karvonen();
        Assertions.assertEquals(138, Math.round(karvonen.getTargetHeartRate(22, 65, 55)));
    }
}
