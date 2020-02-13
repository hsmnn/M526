package ch.epai.ict.m526.theme2.serie1;

import java.util.ArrayList;

public class Composee extends Piece {
    private int nombreMax;
    private ArrayList <Piece> piece;

    Composee(String nom, int nombreMax) {
        super(nom);
        this.nombreMax = nombreMax;
        piece = new ArrayList<Piece>();
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

    @Override
    public String toString() {
        String toString = "";
        toString = this.nom + " (";
        for (int i = 0; i < this.piece.size(); i += 1) {
            if (i + 1 == this.piece.size()){
                toString += this.piece.toString() + ")";
            } else {
                toString += this.piece.toString() + ", ";
            }
        }
        return toString;
    }
}