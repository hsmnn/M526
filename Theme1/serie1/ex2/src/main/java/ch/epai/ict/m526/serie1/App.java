package ch.epai.ict.m526.serie1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Donner la longueur du rectangle : ");
        int longueur = clavier.nextInt();
        System.out.println("Donner la largeur du rectangle : ");
        int largeur = clavier.nextInt();
        clavier.close();

        Rectangle rectangle = new Rectangle(longueur, largeur);

        System.out.println("Longueur : " + rectangle.getLongueur());
        System.out.println("Largeur : " + rectangle.getLargeur());
        System.out.println("Périmètre : " + rectangle.perimetre());
        System.out.println("Aire : " + rectangle.aire());
        System.out.println(rectangle.estCarre());
    }
}
