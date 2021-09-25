/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordStrengthIndicatorTest
{
    @Test
    public void passwordValidator_VeryWeakPassword_1()
    {
        PasswordStrengthIndicator p = new PasswordStrengthIndicator();
        Assertions.assertEquals(1, p.passwordValidator("123"));
        Assertions.assertNotEquals(1, p.passwordValidator("123asd"));
    }

    @Test
    public void passwordValidator_WeakPassword_2()
    {
        PasswordStrengthIndicator p = new PasswordStrengthIndicator();
        Assertions.assertEquals(2, p.passwordValidator("abc"));
        Assertions.assertNotEquals(2, p.passwordValidator("123"));
    }

    @Test
    public void passwordValidator_StrongPassword_3()
    {
        PasswordStrengthIndicator p = new PasswordStrengthIndicator();
        Assertions.assertEquals(3, p.passwordValidator("abcdefg123"));
        Assertions.assertNotEquals(3, p.passwordValidator("123asd"));
    }

    @Test
    public void passwordValidator_VeryStrongPassword_4()
    {
        PasswordStrengthIndicator p = new PasswordStrengthIndicator();
        Assertions.assertEquals(4, p.passwordValidator("abcdefg123!@#$"));
        Assertions.assertNotEquals(4, p.passwordValidator("123asd"));
    }
}
