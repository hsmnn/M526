package ch.epai.ict.m526.theme2.serie1;

import java.util.ArrayList;

public class Construction {
    private int nombreMaxComposant;
    private ArrayList<Composant> composants;

    Construction(int nombreMaxComposant) {
        this.nombreMaxComposant = nombreMaxComposant;
        this.composants = new ArrayList<Composant>();
    }

    public int taille() {
        return this.composants.size();
    }

    public int tailleMax() {
        return this.nombreMaxComposant;
    }

    public void ajouterComposant(Piece piece, int nombreMax){
        if (this.composants.size() > this.nombreMaxComposant){
            System.out.println("Ajout de composant impossible");
        } else {
            Composant composant = new Composant(piece.getNom(), nombreMax);
            this.composants.add(composant);
        }
    }

    public String toString() {
        String toString ="";
        for (int i = 0; i < this.composants.size(); i += 1) {
            toString += this.composants.get(i).getPiece().toString() + " ";
            //toString += this.composants.get(i).getQuantite() + "\n";
        }
        return toString;
    }
}