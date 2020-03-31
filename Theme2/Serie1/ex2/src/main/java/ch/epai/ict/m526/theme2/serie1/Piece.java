package ch.epai.ict.m526.theme2.serie1;

import java.util.ArrayList;

public class Piece {
    protected String nom;
    protected ArrayList<Simple> composee;

    Piece(String nom) {
        this.nom = nom;
        this.composee = new ArrayList<Simple>();
    }

    public String getNom() {
        return this.nom;
    }

    public int getSize() {
        return this.composee.size();
    }

    public String toString() {
        String toString = this.nom;
        for (int i = 0; i < composee.size(); i += 1) {
            toString += " (";
            if (i + 1 == composee.size()){
                toString += composee.get(i).toString() + ")";
            } else {
                toString += composee.get(i).toString() + ", ";
            }
        }
        return toString;
    }
}