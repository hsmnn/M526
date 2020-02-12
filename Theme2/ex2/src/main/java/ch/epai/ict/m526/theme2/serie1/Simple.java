package ch.epai.ict.m526.theme2.serie1;

public class Simple {
    private String nom;
    private String orientation;

    Simple(String nom, String orientation) {
        this.nom = nom;
        this.orientation = orientation;
    }

    Simple(String nom) {
        this.nom = nom;
        this.orientation = "aucune";
    }

    public String getOrientation() {
        return this.orientation;
    }

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