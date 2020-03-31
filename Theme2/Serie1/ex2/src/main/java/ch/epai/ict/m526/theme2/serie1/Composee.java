package ch.epai.ict.m526.theme2.serie1;

public class Composee extends Piece {
    private int nombreMax;

    Composee(String nom, int nombreMax) {
        super(nom);
        this.nombreMax = nombreMax;
    }

    public int tailleMax() {
        return this.nombreMax;
    }

    public int taille() {
        return this.composee.size();
    }

    public void construire(Simple piece){
        if (this.composee.size() < nombreMax) {
            this.composee.add(piece);
        } else {
            System.out.println("Construction impossible.");
        }
    }
}