package ch.epai.ict.m526.serie1;

public class Rectangle {
    private int longueur;
    private int largeur;

    Rectangle(int longueur, int largeur) {
        setLongueur(longueur);
        setLargeur(largeur);
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getLongueur() {
        return this.longueur;
    }

    public int getLargeur() {
        return this.largeur;
    }

    public int perimetre() {
        int peri = (2 * this.largeur) + (2 * this.longueur);
        return peri;
    }

    public int aire() {
        int aire = this.longueur * this.largeur;
        return aire;
    }

    public String estCarre() {
        String isSquare = "";
        if (this.longueur == this.largeur) {
            isSquare = "Il s'agit d'un carré";
        } else {
            isSquare = "Il ne s'agit pas d'un carré";
        }
        return isSquare;
    }
}