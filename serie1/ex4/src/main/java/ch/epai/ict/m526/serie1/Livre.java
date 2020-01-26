package ch.epai.ict.m526.serie1;

public class Livre {
    private String title;
    private String author;
    private int price;

    Livre(String title, String author, int price){
        setTitle(title);
        setAuthor(author);
        setPrice(price);;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPrice() {
        return this.price;
    }

    public String booksInfo() {
        return "Titre: " + this.title + ", Auteur: " + this.author + ", Prix: " + this.price;
    }
}