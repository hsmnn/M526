package ch.epai.ict.m526.theme2.serie1;

public class Simple extends Piece {
    private String orientation;

    Simple(String nom, String orientation) {
        super(nom);
        this.orientation = orientation;
    }

    Simple(String nom) {
        super(nom);
        this.orientation = "aucune";
    }

    public String getOrientation() {
        return this.orientation;
    }

    @Override
    public String toString() {
        String toString = "";
        if (this.orientation == "aucune"){
            toString = this.nom;
        } else {
            toString = this.nom + " [" + this.orientation + "]";
        }
        return toString;
    }
}