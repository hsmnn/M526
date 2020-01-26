package ch.epai.ict.m526.serie1;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner clavier = new Scanner(System.in);
        boolean quit  = false;
        while(quit == false){
            System.out.println("1) Rechercher un article par référence \n2) Ajouter un article au stock en vérifiant l’unicité de la référence \n3) Supprimer un article par référence \n4) Modifier un article par référence \n5) Rechercher un article par nom \n6) Rechercher un article par intervalle de prix de vente \n7) Afficher tous les articles \n8) Quitter");
            System.out.println("Veuillez choisir une des ces options : \n");
            int choix = clavier.nextInt();
    
            Article article = new Article("test", "0", 0, 0);
    
            switch (choix) {
                case 1 :
                    System.out.println("Veuillez entrer l'id de l'article à rechercher: ");
                    String id = clavier.nextLine();
                    System.out.println(article.searchById(id));
                    break;
                case 2 :
                    System.out.println("Veuillez entrer les paramètres de l'article à ajouter: ");
                    System.out.println("Name: ");
                    String name = clavier.nextLine();
                    System.out.println("ID: ");
                    id = clavier.nextLine();
                    System.out.println("Price: ");
                    int price = clavier.nextInt();
                    System.out.println("Quantité: ");
                    int quantity = clavier.nextInt();
                    Article newArticle = new Article(name, id, price, quantity);
                    System.out.println("L'article a bien été ajouté");
                    break;
                case 3 :
                    System.out.println("Veuillez entrer l'id de l'article à supprimer: ");
                    id = clavier.nextLine();
                    article.removeArticleFromStock(id);
                    System.out.println("L'article " + id + "a bien été supprimer");
                    break;
                case 4 :
                    System.out.println("Veuillez entrer l'id de l'article à modifier: ");
                    id = clavier.nextLine();
                    System.out.println("Sélectionner ce que vous voulez modifier: \n1) le nom\n2)le prix\n3)la quantité");
                    int toModifie = clavier.nextInt();
                    switch (toModifie) {
                        case 1 :
                            System.out.println("Veuillez entrer le nouveau nom: ");
                            String newName = clavier.nextLine();
                            article.modifieArticleName(id, newName);
                            System.out.println("Le nom de l'article a bien été modifié");
                            break;
                        case 2 :
                            System.out.println("Veuillez entrer le nouveau prix: ");
                            int newPrice = clavier.nextInt();
                            article.modifieArticlePrice(id, newPrice);
                            System.out.println("Le prix de l'article a bien été modifié");
                            break;
                        case 3 :
                            System.out.println("Veuillez entrer la nouvelle quantité: ");
                            int newQuantity = clavier.nextInt();
                            article.modifieArticleQuantity(id, newQuantity);
                            System.out.println("La quantité de l'article a bien été modifée");
                            break;
                    }
                    break;
                case 5 :
                    System.out.println("Veuillez entrer le nom de l'article à rechercher: ");
                    name = clavier.nextLine();
                    System.out.println(article.searchByName(name));
                    break;
                case 6 :
                    System.out.println("Veuillez entrer le prix minimum:");
                    int minPrice = clavier.nextInt();
                    System.out.println("Veuillez entrer le prix maximum: ");
                    int maxPrice = clavier.nextInt();
                    System.out.println("Les artices correspondant à l'intervalle sont: " + article.priceIntervalle(minPrice, maxPrice));
                    break;
                case 7 :
                    System.out.println("Voici la liste de tous les articles: ");
                    article.displayAllArticle();
                    break;
                case 8 :
                    quit = true;
                    break;
            }
        }
        System.out.println("Merci d'avoir utiliser notre programme. A bientôt !");
        clavier.close();
    }
}
