package ch.epai.ict.m526.theme5.serie2;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws VerifRayonException {
        ArrayList<Forme> list = new ArrayList<Forme>();
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;
        while(repeat) {
            System.out.println("Créateur de forme\n------------------------------------------");
            System.out.println("Choisissez la forme que vous voulez créer: ");
            System.out.println("1) Un cercle\n2) Un segment\n3) Afficher la liste des formes\n4) Quitter");
            int choix = scan.nextInt();
            switch (choix) {
                case 1 :
                    System.out.print("Veuillez entrer les coordonnées du centre du cercle: \nX: ");
                    int x = scan.nextInt();
                    System.out.print("Y: ");
                    int y = scan.nextInt();
                    System.out.print("Veuillez entrer la valeur du rayon:  ");
                    int r = scan.nextInt();
                    Cercle cer = new Cercle(r, x, y);
                    System.out.print("Voulez-vous ajouter cette forme dans la liste ? (1=Oui / 0=Non):  ");
                    int add = scan.nextInt();
                    if (add == 1) {
                        list.add(cer);
                    }
                    System.out.println("Forme créée !\n------------------------------------------");
                    break;
                case 2 :
                    System.out.print("Veuillez entrer les coordonnées du premier point: \nX: ");
                    x = scan.nextInt();
                    System.out.print("Y: ");
                    y = scan.nextInt();
                    System.out.print("Veuillez entrer les coordonnées du deuxième point: \nX: ");
                    int x2 = scan.nextInt();
                    System.out.print("Y: ");
                    int y2 = scan.nextInt();
                    Point pt1 = new Point(x, y);
                    Point pt2 = new Point(x2, y2);
                    Segment seg = new Segment(pt1, pt2);
                    System.out.print("Voulez-vous ajouter cette forme dans la liste ? (1=Oui / 0=Non):  ");
                    add = scan.nextInt();
                    if (add == 1) {
                        list.add(seg);
                    }
                    System.out.println("Forme créée !\n------------------------------------------");
                    break;
                case 3 :
                    System.out.println("Affichage de la liste: ");
                    for (int i = 0; i < list.size(); i += 1) {
                        System.out.println("- " + list.get(i).toString());
                    }
                    System.out.println("------------------------------------------");
                    break;
                case 4:
                    repeat = false;
                    break;
                default :
                    System.out.println("Entrée non valable");
                    break;
            }
        }
        System.out.println("Merci d'avoir utilisé ce programme !");
        scan.close();
    }
}
