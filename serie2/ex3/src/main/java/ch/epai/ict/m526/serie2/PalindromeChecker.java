package ch.epai.ict.m526.serie2;

public class PalindromeChecker {
    public static String isPalindrome(String palindrome) {
        String result = "";
        String userEntry = palindrome.toLowerCase();
        String compare = "";

        for (int i = 1; i <= palindrome.length(); i += 1) {
            compare += userEntry.charAt(userEntry.length() - i);
        }
        if (compare.equals(userEntry)) {
            result = palindrome + " est un palindrome.";
        }else {
            result = palindrome + " n'est pas un palindrome";
        }

        return result;
    }
}