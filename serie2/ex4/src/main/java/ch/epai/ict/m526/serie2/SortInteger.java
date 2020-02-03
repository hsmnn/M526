package ch.epai.ict.m526.serie2;

import java.util.Arrays;

public class SortInteger {
    public static int[] triCroissant(int tab []){
        Arrays.sort(tab);
        return tab;
    }

    public static int[] triDecroissant(int tab []) {
        int sortedTab[] = new int[tab.length];
        Arrays.sort(tab);
        for (int i = 1; i <= tab.length; i += 1) {
            sortedTab[i - 1] = tab[tab.length - i];
        }
        return sortedTab;
    }

    public static String afficherTab(int tab []) {
        String tabInitial = "[";
        for (int i = 0; i < tab.length; i += 1) {
            if (i == tab.length - 1) {
                tabInitial += tab[i] + "]";
            }else {
                tabInitial += tab[i] + ", ";
            }
        }
        return tabInitial;
    }
}