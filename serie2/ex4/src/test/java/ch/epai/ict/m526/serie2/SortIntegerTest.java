package ch.epai.ict.m526.serie2;

import junit.framework.Assert;

public class SortIntegerTest {
    public void triCroissantTest() {
        int tab[] = {1, 4, 2};
        int expected[] = {1, 2, 4};
        int actual[] = SortInteger.triCroissant(tab);
        Assert.assertEquals(expected, actual);
    }

    public void triDecroissantTest() {
        int tab[] = {1, 4, 2};
        int expected[] = {4, 2, 1};
        int actual[] = SortInteger.triDecroissant(tab);
        Assert.assertEquals(expected, actual);
    }

    public void afficherTabTest() {
        int tab[] = {1, 4, 2};
        String expected = "[1, 4, 2]";
        String actual = SortInteger.afficherTab(tab);
        Assert.assertEquals(expected, actual);
    }
}