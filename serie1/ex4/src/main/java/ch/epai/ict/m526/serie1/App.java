package ch.epai.ict.m526.serie1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        int i = 1;
        while (i < 10) {
            System.out.println("Livre " + i + " :");
            System.out.print("Donner le titre: ");
            String titre = clavier.nextLine();
            System.out.print("Donner l'auteur: ");
            String auteur = clavier.nextLine();
            System.out.print("Donner le prix: ");
            String prix = clavier.nextLine();
            Livre livre = new Livre(titre, auteur, prix);
            System.out.println(livre.booksInfo());
            i += 1;
        }
        clavier.close();
    }
}