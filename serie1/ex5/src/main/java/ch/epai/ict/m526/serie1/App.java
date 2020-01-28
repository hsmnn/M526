package ch.epai.ict.m526.serie1;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner clavier = new Scanner(System.in);
        boolean quit  = false;
        Article article = new Article("test", "0", 450, 30);
        while(quit == false){
            System.out.println("1) Rechercher un article par référence \n2) Ajouter un article au stock en vérifiant l’unicité de la référence \n3) Supprimer un article par référence \n4) Modifier un article par référence \n5) Rechercher un article par nom \n6) Rechercher un article par intervalle de prix de vente \n7) Afficher tous les articles \n8) Quitter");
            System.out.println("Veuillez choisir une des ces options : \n");
            int choix = clavier.nextInt();
    
            switch (choix) {
                case 1 :
                    article.searchById();
                    break;
                case 2 :
                    article.addArticle();
                    break;
                case 3 :
                    article.removeArticleFromStock();
                    break;
                case 4 :
                    article.modifieArticle();
                    break;
                case 5 :
                    article.searchByName();
                    break;
                case 6 :
                    article.priceIntervalle();
                    break;
                case 7 :
                    System.out.println("Voici la liste de tous les articles: ");
                    article.displayAllArticle();
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
