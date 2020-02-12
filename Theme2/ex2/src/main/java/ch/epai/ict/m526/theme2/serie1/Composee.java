package ch.epai.ict.m526.theme2.serie1;

import java.util.ArrayList;

public class Composee {
    private String nom;
    private int nombreMax;
    ArrayList <Simple> piece;

    Composee(String nom, int nombreMax) {
        this.nom = nom;
        this.nombreMax = nombreMax;
        piece = new ArrayList<Simple>();
    }

    public int tailleMax() {
        return this.nombreMax;
    }

    public void construire(Simple piece){
        if (this.piece.size() < nombreMax) {
            this.piece.add(piece);
        } else {
            System.out.println("Construction impossible\n");
        }
    }

    public String toString() {
        String toString = "";
        toString = this.nom;
        for (int i = 0; i < this.piece.size(); i += 1) {
            if (i + 1 == this.piece.size()){
                toString += this.piece.get(i);
            } else {
                toString += this.piece.get(i) + ", ";
            }
        }
        return toString;
    }
}