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
        return this.composants.size();
    }

    public void construire(Simple piece){
        if (this.composants.size() < nombreMax) {
            this.composants.add(piece);
        } else {
            System.out.println("Construction impossible.");
        }
    }

    @Override
    public String toString() {
        String toString = "";
        toString = this.nom + " (";
        for (int i = 0; i < this.composants.size(); i += 1) {
            if (i + 1 == this.composants.size()){
                toString += this.composants.get(i).toString() + ")";
            } else {
                toString += this.composants.get(i).toString() + ", ";
            }
        }
        return toString;
    }
}