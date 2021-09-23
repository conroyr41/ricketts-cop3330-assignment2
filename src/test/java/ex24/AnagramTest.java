/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnagramTest
{
    @Test
    public void isAnagram_NotAnagrams_False()
    {
        Anagram anagram = new Anagram();
        Assertions.assertFalse(anagram.isAnagram("tone", "tond"));
        Assertions.assertFalse(anagram.isAnagram("tone", "tonee"));
    }

    @Test
    public void isAnagram_AreAnagrams_True()
    {
        Anagram anagram = new Anagram();
        Assertions.assertTrue(anagram.isAnagram("tone", "enot"));
    }
}
