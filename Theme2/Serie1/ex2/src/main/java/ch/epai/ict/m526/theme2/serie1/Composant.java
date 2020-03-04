package ch.epai.ict.m526.theme2.serie1;

public class Composant {
    private int quantite;
    private Piece piece;

    Composant(String nom, int quantite) {
        this.piece = new Piece(nom);
        this.quantite = quantite;
    }

    public Piece getPiece() {
        return this.piece;
    }

    public String getQuantite() {
        return "(quantite " + this.quantite + ")";
    }
}