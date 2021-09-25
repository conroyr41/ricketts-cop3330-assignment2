/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentCalculatorTest
{
    @Test
    public void calculateMonthsUntilPaidOff_GivenExampleInput_69()
    {
        PaymentCalculator paymentCalculator = new PaymentCalculator();
        Assertions.assertEquals(69, paymentCalculator.calculateMonthsUntilPaidOff(5000, 12, 100));
        Assertions.assertNotEquals(69, paymentCalculator.calculateMonthsUntilPaidOff(5000, 13, 100));
    }
}
