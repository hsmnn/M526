package ch.epai.ict.m526.serie1;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner clavier = new Scanner(System.in);
        boolean quit  = false;
        Program program = new Program();
        while(quit == false){
            System.out.println("1) Rechercher un article par référence \n2) Ajouter un article au stock en vérifiant l’unicité de la référence \n3) Supprimer un article par référence \n4) Modifier un article par référence \n5) Rechercher un article par nom \n6) Rechercher un article par intervalle de prix de vente \n7) Afficher tous les articles \n8) Quitter");
            System.out.println("Veuillez choisir une des ces options : \n");
            int choix = clavier.nextInt();
    
            switch (choix) {
                case 1 :
                    program.searchById();
                    break;
                case 2 :
                    program.addArticle();
                    break;
                case 3 :
                    program.removeArticleFromStock();
                    break;
                case 4 :
                    program.modifieArticle();
                    break;
                case 5 :
                    program.searchByName();
                    break;
                case 6 :
                    program.priceIntervalle();
                    break;
                case 7 :
                    System.out.println("Voici la liste de tous les articles: ");
                    program.displayAllArticle();
                    break;
                case 8 :
                    quit = true;
                    break;
                default :
                    System.out.println("Ceci n'est pas une proposition.");
                    break;
            }
        }
        System.out.println("Merci d'avoir utiliser notre programme. A bientôt !");
        clavier.close();
    }
}
