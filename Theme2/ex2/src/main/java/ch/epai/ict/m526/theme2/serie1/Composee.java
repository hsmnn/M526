package ch.epai.ict.m526.theme2.serie1;

import java.util.ArrayList;

public class Composee extends Piece {
    private int nombreMax;

    Composee(String nom, int nombreMax) {
        super(nom);
        this.nombreMax = nombreMax;
        pieces = new ArrayList<Piece>();
    }

    public int tailleMax() {
        return this.nombreMax;
    }

    public int taille() {
        return this.pieces.size();
    }

    public void construire(Simple piece){
        if (this.pieces.size() < nombreMax) {
            this.pieces.add(piece);
        } else {
            System.out.println("Construction impossible\n");
        }
    }

    @Override
    public String toString() {
        String toString = "";
        toString = this.nom + " (";
        for (int i = 0; i < this.pieces.size(); i += 1) {
            if (i + 1 == this.pieces.size()){
                toString += this.pieces.toString() + ")";
            } else {
                toString += this.pieces.toString() + ", ";
            }
        }
        return toString;
    }
}