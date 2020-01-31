package ch.epai.ict.m526.serie2;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner clavier = new Scanner(System.in);
        boolean repeat = true;
        while (repeat) {
            System.out.println( "Veuillez saisir une chaîne de caractère: " );
            String palindrome = clavier.nextLine();
    
            System.out.println(PalindromeChecker.isPalindrome(palindrome));
        }
        clavier.close();
    }
}
