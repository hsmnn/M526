package ch.epai.ict.m526.serie1;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Donner l'abscisse du centre : ");
        double abscisse = clavier.nextInt();
        System.out.print("Donner l'ordonné du centre : ");
        double ordonne = clavier.nextInt();
        System.out.print("Donner le rayon : ");
        double rayon = clavier.nextInt();

        Cercle cercle = new Cercle (abscisse, ordonne, rayon);

        System.out.println("CERCLE (" + abscisse + ", " + ordonne + ", " + rayon + ")");
        System.out.println("Le périmètre est : " + cercle.getPerimetre());
        System.out.println("La surface est : " + cercle.getSurface());

        System.out.println("Donner un point : ");
        System.out.print("X:");
        double x = clavier.nextInt();
        System.out.print("Y:");
        double y = clavier.nextInt();

        clavier.close();

        System.out.println("POINT : (" + x + ", " + y + ")");
        System.out.println(cercle.appartient(x, y));

    }
}
