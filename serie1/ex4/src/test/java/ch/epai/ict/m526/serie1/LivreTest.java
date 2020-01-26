package ch.epai.ict.m526.serie1;

import junit.framework.Assert;

public class LivreTest {
    public void setAndGetTitleTest() {
        String title = "Titre";
        String author = "Auteur";
        int price = 42;
        Livre livre = new Livre(title, author, price);
        String expected = "Titre";
        String actual = livre.getTitle();

        Assert.assertEquals(expected, actual);
    }

    public void setAndGetAuthorTest() {
        String title = "Titre";
        String author = "Auteur";
        int price = 42;
        Livre livre = new Livre(title, author, price);
        String expected = "Auteur";
        String actual = livre.getAuthor();

        Assert.assertEquals(expected, actual);
    }

    public void setAndGetPriceTest() {
        String title = "Titre";
        String author = "Auteur";
        int price = 42;
        Livre livre = new Livre(title, author, price);
        int expected = 42;
        int actual = livre.getPrice();

        Assert.assertEquals(expected, actual);
    }

    public void booksInfoTest() {
        String title = "Titre";
        String author = "Auteur";
        int price = 42;
        Livre livre = new Livre(title, author, price);
        String expected = "Titre: " + title + ", Auteur: " + author + ", Prix: " + price;
        String actual = livre.booksInfo();

        Assert.assertEquals(expected, actual);
    }
}