/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex33;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class EightBallTest
{
    @Test
    public void getResponse_GivenList_CertainMessage()
    {
        EightBall eightBall = new EightBall();
        String response = eightBall.getResponse(eightBall.responses);
        Assertions.assertTrue(Objects.equals(response, "Yes") || Objects.equals(response, "Maybe") || Objects.equals(response, "No") || Objects.equals(response, "Ask again later."));
    }
}
