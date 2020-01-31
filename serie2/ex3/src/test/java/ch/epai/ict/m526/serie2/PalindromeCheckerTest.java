package ch.epai.ict.m526.serie2;

import junit.framework.Assert;

public class PalindromeCheckerTest {
    public void isPalindromeTestTrue() {
        String palindrome = "sugus";
        String expected = palindrome + " est un palindrome.";
        String actual = PalindromeChecker.isPalindrome(palindrome);
        Assert.assertEquals(expected, actual);
    }

    public void isPalindromeTestFalse() {
        String palindrome = "toto";
        String expected = palindrome + " n'est pas un palindrome";
        String actual = PalindromeChecker.isPalindrome(palindrome);
        Assert.assertEquals(expected, actual);
    }
}