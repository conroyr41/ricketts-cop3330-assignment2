/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex34;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class ListRemovalTest
{
    @Test
    public void displayEmployees_GivenList_1()
    {
        ListRemoval listRemoval = new ListRemoval();
        ArrayList<String> testList = new ArrayList<String>();

        testList.add("John Smith");

        //1 indicates successful completion.
        Assertions.assertEquals(1, listRemoval.displayEmployees(testList));
    }
}
