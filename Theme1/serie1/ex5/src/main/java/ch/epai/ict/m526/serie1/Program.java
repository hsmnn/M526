package ch.epai.ict.m526.serie1;

import java.util.Scanner;
import java.util.ArrayList;

public class Program {

    private ArrayList<Article> articles;

    Program() {
        this.articles = new ArrayList<Article>();
    }

    Scanner clavier = new Scanner(System.in);

    public void searchById() {
        System.out.println("Veuillez entrer l'id de l'article à rechercher: ");
        int id = clavier.nextInt();
        String name = "";
        for (int i = 0; i <= this.articles.size(); i += 1) {
            if (id == articles.get(i).getId()) {
                name = articles.get(i).getName();
            }
        }
        System.out.println("L'article recherché est: " + name);
    }

    public void removeArticleFromStock() {
        System.out.println("Veuillez entrer l'id de l'article à supprimer: ");
        int id = clavier.nextInt();
        for (int i = 0; i < articles.size(); i += 1) {
            if (id == articles.get(i).getId()) {
                articles.remove(i);
            }
        }
        System.out.println("L'article " + id + "a bien été supprimer");
    }

    public void searchByName() {
        System.out.println("Veuillez entrer le nom de l'article à rechercher: ");
        String name = clavier.nextLine();
        int id = 0;
        for (int i = 0; i < articles.size(); i += 1) {
            if (name == articles.get(i).getName()) {
                id = articles.get(i).getId();
            }
        }
        System.out.println("L'article recherché est: " + id);
    }

    public void priceIntervalle() {
        System.out.println("Veuillez entrer le prix minimum:");
        int minPrice = clavier.nextInt();
        System.out.println("Veuillez entrer le prix maximum: ");
        int maxPrice = clavier.nextInt();
        String artIntervalle = "";
        for (int i = 0; i < articles.size(); i += 1){
            int artPrice = articles.get(i).getPrice();
            if ((artPrice > minPrice) && (artPrice < maxPrice)){
                artIntervalle += articles.get(i);
            }
        }
        System.out.println("Les artices correspondant à l'intervalle sont: " + artIntervalle);
    }

    public void displayAllArticle() {
        for (int i = 0; i < this.articles.size(); i += 1){
            System.out.println(articles.get(i).getName() + " ");
        }
    }

    public void modifieArticleName(int id, String newName) {
        for (int i = 0; i < articles.size(); i += 1) {
            if (id == articles.get(i).getId()) {
                articles.get(i).setName(newName);
            }
        }
    }

    public void modifieArticlePrice(int id, int newPrice) {
        for (int i = 0; i < articles.size(); i += 1) {
            if (id == articles.get(i).getId()) {
                articles.get(i).setPrice(newPrice);
            }
        }
    }

    public void modifieArticleQuantity(int id, int newQuantity) {
        for (int i = 0; i < articles.size(); i += 1) {
            if (id == articles.get(i).getId()) {
                articles.get(i).setQuantity(newQuantity);
            }
        }
    }

    public void modifieArticle() {
        System.out.println("Veuillez entrer l'id de l'article à modifier: ");
        int id = clavier.nextInt();
        System.out.println("Sélectionner ce que vous voulez modifier: \n1) le nom\n2)le prix\n3)la quantité");
        int toModifie = clavier.nextInt();
        switch (toModifie) {
            case 1 :
                System.out.println("Veuillez entrer le nouveau nom: ");
                String newName = clavier.nextLine();
                modifieArticleName(id, newName);
                System.out.println("Le nom de l'article a bien été modifié");
                break;
            case 2 :
                System.out.println("Veuillez entrer le nouveau prix: ");
                int newPrice = clavier.nextInt();
                modifieArticlePrice(id, newPrice);
                System.out.println("Le prix de l'article a bien été modifié");
                break;
            case 3 :
                System.out.println("Veuillez entrer la nouvelle quantité: ");
                int newQuantity = clavier.nextInt();
                modifieArticleQuantity(id, newQuantity);
                System.out.println("La quantité de l'article a bien été modifée");
                break;
        }
    }
    
    public void addArticle() {
        System.out.println("Veuillez entrer les paramètres de l'article à ajouter: ");
        System.out.println("Name: ");
        String name = clavier.nextLine();
        System.out.println("Id: ");
        int id = clavier.nextInt();
        System.out.println("Price: ");
        int price = clavier.nextInt();
        System.out.println("Quantité: ");
        int quantity = clavier.nextInt();
        Article newArticle = new Article(name, id, price, quantity);
        this.articles.add(newArticle);
        System.out.println("L'article a bien été ajouté");
    }
}