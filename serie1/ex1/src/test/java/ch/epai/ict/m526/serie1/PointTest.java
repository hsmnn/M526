package ch.epai.ict.m526.serie1;

import junit.framework.Assert;

/**
 * Création de la classe PointTest qui sert à tester les fonctions du la classe Point
 * 
 * @author Elie Hausmann
 * @version 1.0
 * @since 1.0
 */
public class PointTest {

    /**
     * La fonction setAbscisse doit modifier la valeur de la variable membre et
     * la fonction getAbscisse doit renvoyer la valeur de cette variable modifiée.
     */
    public void setAbscisseAndGetAbscisseTest(){
        double abscisse = 1;
        double ordonne = 2;
        Point axe = new Point(abscisse, ordonne);
        double expected = 1;
        double actual = axe.getAbscisse();

        Assert.assertEquals("La fonction setAbscisse doit modifier la variable membre et la fonction getAbscisse doit renvoyer la valeur de la variable membre.", expected, actual);
    }

    /**
     * La fonction setOrdonne doit modifier la valeur de la variable membre et
     * la fontion getOrdonne doit renvoyer la valeur de cette variable modifiée.
     */
    public void setOrdonneAndGetOrdonneTest(){
        double abscisse = 1;
        double ordonne = 2;
        Point axe = new Point(abscisse, ordonne);
        double expected = 1;
        double actual = axe.getOrdonne();

        Assert.assertEquals("La fonction setOrdonne doit modifier la valeur de la variable membre et la fonction getOrdonne doit la renvoyer", expected, actual);
    }

    /**
     * La fonction norme doit calculer la distance entre l'origine et le point donné par l'utilisateur.
     * Test si le résultat est correcte avec un point positif.
     */
    public void normePositifValue(){
        double abscisse = 1;
        double ordonne = 2;
        double expected = 2.236;
        Point axe = new Point(abscisse, ordonne);
        double actual = axe.norme();

        Assert.assertEquals("La fonction norme() doit calculer la distance entre le point donné pas l'utilisateur et l'origine.", expected, actual);
    }

    /**
     * La fonction norme doit calculer la distance entre l'origine et le point donné par l'utilisateur.
     * Test si le résultat est correcte avec un point négatif.
     */
    public void normeNegatifValue(){
        double abscisse = -1;
        double ordonne = -2;
        double expected = 2.236;
        Point axe = new Point(abscisse, ordonne);
        double actual = axe.norme();

        Assert.assertEquals("La fonction norme() doit calculer la distance entre le point donné pas l'utilisateur et l'origine.", expected, actual);
    }
}