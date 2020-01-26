package ch.epai.ict.m526.serie1;

import java.util.Scanner;

/**
 * Création de la classe App.
 * 
 * @author Elie Hausmann
 * @version 1.0
 * @since 1.0
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner clavier = new Scanner(System.in);

        System.out.println( "Donner l'abscisse :" );
        double abscisse = clavier.nextInt();
        System.out.println( "Donner l'ordonné :" );
        double ordonne = clavier.nextInt();
        clavier.close();

        Point axe = new Point(abscisse, ordonne);
        axe.setAbscisse(abscisse);
        axe.setOrdonne(ordonne);

        System.out.println("La norme du point (" + abscisse + ", " + ordonne + ") est : " + axe.norme());
    }
}