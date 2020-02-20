package ch.epai.ict.m526.theme2.serie1;

import java.util.ArrayList;

public class Piece {
    protected String nom;
    protected ArrayList<Piece> pieces;

    Piece(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public String toString() {
        return this.nom;
    }
}