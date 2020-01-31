package ch.epai.ict.m526.serie2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int min = 0;
        int max = 100;

        System.out.println("Veuillez saisir la taille du tableau: ");
        int taille = clavier.nextInt();
        System.out.println("Veuillez saisir l'orddre du tri (0 - croissant, 1 - décroissant): ");
        int tri = clavier.nextInt();

        int tab[] = new int[taille];
        for (int i = 0; i < taille; i += 1) {
            tab[i] = min + (int) (Math.random() * max);
        }
        
        System.out.println("Tableau initial : [" + SortInteger.afficherTab(tab) + "]");

        switch (tri) {
        case 0:
            int tabTrie[] = SortInteger.triCroissant(tab);
            System.out.println("Tableau trié : " + SortInteger.afficherTab(tabTrie));
            break;
        case 1:
            tabTrie = SortInteger.triDecroissant(tab);
            System.out.println("Tableau trié : " + SortInteger.afficherTab(tabTrie));
            break;
        default:
            System.out.println("Entréé invalide.");
        }

        clavier.close();
    }
}
