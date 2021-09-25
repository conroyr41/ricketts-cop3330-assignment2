/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InputValidatorTest
{
    @Test
    public void validateFirstName_CorrectInput_EmptyString()
    {
        InputValidator iv = new InputValidator();
        Assertions.assertEquals("", iv.validateFirstName("Conroy"));
        Assertions.assertNotEquals("The first name must be filled in.\n", iv.validateFirstName("Conroy"));
    }

    @Test
    public void validateLastName_CorrectInput_EmptyString()
    {
        InputValidator iv = new InputValidator();
        Assertions.assertEquals("", iv.validateLastName("Ricketts"));
        Assertions.assertNotEquals("The last name must be filled in.\n", iv.validateLastName("Ricketts"));
    }

    @Test
    public void validateZipCode_CorrectInput_EmptyString()
    {
        InputValidator iv = new InputValidator();
        Assertions.assertEquals("", iv.validateZipCode("12345"));
        Assertions.assertNotEquals("The zipcode must be a 5 digit number.\n", iv.validateZipCode("12345"));
    }

    @Test
    public void validateEmployeeID_CorrectInput_EmptyString()
    {
        InputValidator iv = new InputValidator();
        Assertions.assertEquals("", iv.validateEmployeeID("ab-1234"));
        Assertions.assertNotEquals("The employee ID must be in the format of AA-1234.\n", iv.validateEmployeeID("ab-1234"));
    }
}
