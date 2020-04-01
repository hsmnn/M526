package ch.epai.ict.m526.theme2.serie1;

import java.util.ArrayList;

public class Construction {
    private int nombreMaxComposant;
    private ArrayList<ArrayList> list;
    private ArrayList<Piece>listPieces;
    private ArrayList<Composant>composants;

    Construction(int nombreMaxComposant) {
        this.nombreMaxComposant = nombreMaxComposant;
        this.list = new ArrayList<ArrayList>();
        this.listPieces = new ArrayList<Piece>();
        this.composants = new ArrayList<Composant>();
    }

    public int taille() {
        return this.list.size();
    }

    public int tailleMax() {
        return this.nombreMaxComposant;
    }

    public void ajouterComposant(Piece piece, int nombreMax){
        if (this.list.size() > this.nombreMaxComposant){
            System.out.println("Ajout de composant impossible");
        } else {
            Composant composant = new Composant(piece.getNom(), nombreMax);
            this.composants.add(composant);
            this.listPieces.add(piece);
            this.list.add(listPieces);
        }
    }

    public String toString() {
        String toString ="";
        for (int i = 0; i < this.list.size(); i += 1) {
            //toString += this.composants.get(i).getPiece().toString() + " ";
            toString += this.list.get(i).get(i).toString() + " ";
            toString += this.composants.get(i).getQuantite() + "\n";
        }
        return toString;
    }
}