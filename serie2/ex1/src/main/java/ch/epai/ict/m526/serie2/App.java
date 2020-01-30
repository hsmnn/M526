package ch.epai.ict.m526.serie2;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner clavier = new Scanner(System.in);
        boolean repeat = false;

        while(repeat == false) {
            System.out.println( "Entrer votre mot de passe: " );
            String password = clavier.nextLine();
    
            Password newPassword = new Password(password);
            repeat = newPassword.isValid();
            if (repeat == true){
                System.out.println("Mot de passe acceptable.");
            }else{
                System.out.println("Ce mot de acceptable n'est pas acceptable.");
            }
        }

        clavier.close();
    }
}
