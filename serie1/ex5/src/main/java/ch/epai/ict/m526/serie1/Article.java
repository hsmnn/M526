package ch.epai.ict.m526.serie1;

import java.util.ArrayList;

public class Article {
    private String id;
    private String name;
    private int price;
    private int quantity;
    private ArrayList<Article> articles;

    Article(String name, String id, int price, int quantity) {
        setId(id);
        setName(name);
        setPrice(price);
        setQuantity(quantity);
        setArticle(articles);
    }

    public void setArticle(ArrayList<Article> articles) {
        this.articles = new ArrayList<Article>(articles);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String searchById(String id) {
        String name = "";
        for (int i = 0; i < articles.size(); i += 1) {
            if (id == articles.get(i).getId()) {
                name = articles.get(i).getName();
            }
        }
        return "L'article recherché est: " + name;
    }

    public void removeArticleFromStock(String id) {
        for (int i = 0; i < articles.size(); i += 1) {
            if (id == articles.get(i).getId()) {
                articles.remove(i);
            }
        }
    }

    public String searchByName(String name) {
        String id = "";
        for (int i = 0; i < articles.size(); i += 1) {
            if (name == articles.get(i).getName()) {
                id = articles.get(i).getId();
            }
        }
        return "L'article recherché est: " + id;
    }

    public String priceIntervalle(int minPrice, int maxPrice) {
        return "";
    }

    public void displayAllArticle() {
        for (int i = 0; i < articles.size(); i += 1){
            
        }
    }

    public void modifieArticleName(String id, String newName) {
        for (int i = 0; i < articles.size(); i += 1) {
            if (id == articles.get(i).getId()) {
                articles.get(i).setName(newName);
            }
        }
    }

    public void modifieArticlePrice(String id, int newPrice) {
        for (int i = 0; i < articles.size(); i += 1) {
            if (id == articles.get(i).getId()) {
                articles.get(i).setPrice(newPrice);
            }
        }
    }

    public void modifieArticleQuantity(String id, int newQuantity) {
        for (int i = 0; i < articles.size(); i += 1) {
            if (id == articles.get(i).getId()) {
                articles.get(i).setQuantity(newQuantity);
            }
        }
    }
}