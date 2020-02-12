package ch.epai.ict.m526.theme2.serie1;

public class Piece {
    private String nom;

    Piece(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public String toString() {
        return this.nom + " (nom de la pièce)";
    }
}