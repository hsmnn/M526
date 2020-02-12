package ch.epai.ict.m526.serie1;

import junit.framework.Assert;

public class CercleTest {

    public void setAndGetXATest (){
        double xA = 1;
        double yA = 2;
        double r = 3;
        Cercle cercle = new Cercle (xA, yA, r);
        double expected = 1;
        double actual = cercle.getXA();

        Assert.assertEquals(expected, actual);
    }

    public void setAndGetYATest() {
        double xA = 1;
        double yA = 2;
        double r = 3;
        Cercle cercle = new Cercle (xA, yA, r);
        double expected = 2;
        double actual = cercle.getYA();

        Assert.assertEquals(expected, actual);
    }

    public void setAndGetRTest() {
        double xA = 1;
        double yA = 2;
        double r = 3;
        Cercle cercle = new Cercle (xA, yA, r);
        double expected = 3;
        double actual = cercle.getR();

        Assert.assertEquals(expected, actual);
    }

    public void getPerimetreTest() {
        double xA = 1;
        double yA = 2;
        double r = 3;
        Cercle cercle = new Cercle (xA, yA, r);
        double expected = 18.84;
        double actual = cercle.getPerimetre();

        Assert.assertEquals(expected, actual);
    }

    public void getSurfaceTest() {
        double xA = 1;
        double yA = 2;
        double r = 3;
        Cercle cercle = new Cercle (xA, yA, r);
        double expected = 28.26;
        double actual = cercle.getSurface();

        Assert.assertEquals(expected, actual);
    }

    public void appartientFalseTest() {
        double xA = 1;
        double yA = 2;
        double r = 3;
        double xB = 2;
        double yB = 3;
        Cercle cercle = new Cercle (xA, yA, r);
        String expected = "Le point n'appartient pas au cercle";
        String actual = cercle.appartient(xB, yB);

        Assert.assertEquals(expected, actual);
    }

    public void appartientTrueTest() {
        double xA = 1;
        double yA = 2;
        double r = 5;
        double xB = 2;
        double yB = 3;
        Cercle cercle = new Cercle (xA, yA, r);
        String expected = "Le point appartient au cercle";
        String actual = cercle.appartient(xB, yB);

        Assert.assertEquals(expected, actual);
    }
}