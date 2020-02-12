package ch.epai.ict.m526.serie1;

import junit.framework.Assert;

public class RectangleTest {
    public void setAndGetLongueurTest() {
        int longueur = 1;
        int largeur = 2;
        Rectangle rectangle = new Rectangle(longueur, largeur);
        int expected = 1;
        int actual = rectangle.getLongueur();

        Assert.assertEquals(expected, actual);
    }

    public void setAndGetLargeurTest() {
        int longueur = 1;
        int largeur = 2;
        Rectangle rectangle = new Rectangle(longueur, largeur);
        int expected = 2;
        int actual = rectangle.getLargeur();

        Assert.assertEquals(expected, actual);
    }

    public void perimetreTest() {
        int longueur = 1;
        int largeur = 2;
        Rectangle rectangle = new Rectangle(longueur, largeur);
        int expected = 6;
        int actual = rectangle.perimetre();

        Assert.assertEquals(expected, actual);
    }

    public void aireTest() {
        int longueur = 1;
        int largeur = 2;
        Rectangle rectangle = new Rectangle(longueur, largeur);
        int expected = 2;
        int actual = rectangle.aire();

        Assert.assertEquals(expected, actual);
    }

    public void estCarreTrueTest() {
        int longueur = 2;
        int largeur = 2;
        Rectangle rectangle = new Rectangle(longueur, largeur);
        String expected = "Il s'agit d'un carré";
        String actual = rectangle.estCarre();

        Assert.assertEquals(expected, actual);
    }

    public void estCarreFalseTest() {
        int longueur = 1;
        int largeur = 2;
        Rectangle rectangle = new Rectangle(longueur, largeur);
        String expected = "Il ne s'agit pas d'un carré";
        String actual = rectangle.estCarre();

        Assert.assertEquals(expected, actual);
    }
}