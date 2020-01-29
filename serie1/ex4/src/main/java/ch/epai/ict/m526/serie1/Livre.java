package ch.epai.ict.m526.serie1;

public class Livre {
    private String title;
    private String author;
    private String price;

    Livre(String title, String author, String price){
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

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getPrice() {
        return this.price;
    }

    public String booksInfo() {
        return "Titre: " + this.title + ", Auteur: " + this.author + ", Prix: " + this.price;
    }
}