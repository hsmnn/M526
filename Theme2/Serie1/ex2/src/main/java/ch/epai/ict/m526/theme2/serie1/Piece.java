package ch.epai.ict.m526.theme2.serie1;

import java.util.ArrayList;

public class Piece {
    protected String nom;
    protected ArrayList<Simple> composants;
    protected ArrayList<Piece> pieces;

    Piece(String nom) {
        this.nom = nom;
        pieces = new ArrayList<Piece>();
        composants = new ArrayList<Simple>();
    }

    public String getNom() {
        return this.nom;
    }

    public String toString() {
        String toString = this.nom;
        for (int i = 0; i < composants.size(); i += 1) {
            toString += " (";
            if (i + 1 == composants.size()){
                toString += composants.get(i).toString() + ")";
            } else {
                toString += composants.get(i).toString() + ", ";
            }
        }
        return toString;
    }
}