/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplicationTableTest
{
    @Test
    public void createTable_TableSizeOf12_1()
    {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        Assertions.assertEquals(1,multiplicationTable.createTable(12));
    }
}
