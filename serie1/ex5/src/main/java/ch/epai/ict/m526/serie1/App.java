package ch.epai.ict.m526.serie1;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner clavier = new Scanner(System.in);
        boolean quit  = false;
        Article article = new Article("test", "0", 450, 30);
        while(quit == false){
            System.out.print("1) Rechercher un article par référence \n2) Ajouter un article au stock en vérifiant l’unicité de la référence \n3) Supprimer un article par référence \n4) Modifier un article par référence \n5) Rechercher un article par nom \n6) Rechercher un article par intervalle de prix de vente \n7) Afficher tous les articles \n8) Quitter");
            System.out.print("Veuillez choisir une des ces options : \n");
            int choix = clavier.nextInt();
    
            switch (choix) {
                case 1 :
                    System.out.print(article.searchById());
                    break;
                /*case 2 :
                    System.out.print("Veuillez entrer les paramètres de l'article à ajouter: ");
                    System.out.print("Name: ");
                    String name = clavier.nextLine();
                    System.out.print("ID: ");
                    id = clavier.nextLine();
                    System.out.print("Price: ");
                    int price = clavier.nextInt();
                    System.out.print("Quantité: ");
                    int quantity = clavier.nextInt();
                    Article newArticle = new Article(name, id, price, quantity);
                    System.out.print("L'article a bien été ajouté");
                    break;
                case 3 :
                    System.out.print("Veuillez entrer l'id de l'article à supprimer: ");
                    id = clavier.nextLine();
                    article.removeArticleFromStock(id);
                    System.out.print("L'article " + id + "a bien été supprimer");
                    break;
                case 4 :
                    System.out.print("Veuillez entrer l'id de l'article à modifier: ");
                    id = clavier.nextLine();
                    System.out.print("Sélectionner ce que vous voulez modifier: \n1) le nom\n2)le prix\n3)la quantité");
                    int toModifie = clavier.nextInt();
                    switch (toModifie) {
                        case 1 :
                            System.out.print("Veuillez entrer le nouveau nom: ");
                            String newName = clavier.nextLine();
                            article.modifieArticleName(id, newName);
                            System.out.print("Le nom de l'article a bien été modifié");
                            break;
                        case 2 :
                            System.out.print("Veuillez entrer le nouveau prix: ");
                            int newPrice = clavier.nextInt();
                            article.modifieArticlePrice(id, newPrice);
                            System.out.print("Le prix de l'article a bien été modifié");
                            break;
                        case 3 :
                            System.out.print("Veuillez entrer la nouvelle quantité: ");
                            int newQuantity = clavier.nextInt();
                            article.modifieArticleQuantity(id, newQuantity);
                            System.out.print("La quantité de l'article a bien été modifée");
                            break;
                    }
                    break;
                case 5 :
                    System.out.print("Veuillez entrer le nom de l'article à rechercher: ");
                    name = clavier.nextLine();
                    System.out.print(article.searchByName(name));
                    break;
                case 6 :
                    System.out.print("Veuillez entrer le prix minimum:");
                    int minPrice = clavier.nextInt();
                    System.out.print("Veuillez entrer le prix maximum: ");
                    int maxPrice = clavier.nextInt();
                    System.out.print("Les artices correspondant à l'intervalle sont: " + article.priceIntervalle(minPrice, maxPrice));
                    break;
                case 7 :
                    System.out.print("Voici la liste de tous les articles: ");
                    article.displayAllArticle();
                    break;
                case 8 :
                    quit = true;
                    break;*/
                default :
                    System.out.print("Ceci n'est pas une proposition.");
                    break;
            }
        }
        System.out.print("Merci d'avoir utiliser notre programme. A bientôt !");
        clavier.close();
    }
}
