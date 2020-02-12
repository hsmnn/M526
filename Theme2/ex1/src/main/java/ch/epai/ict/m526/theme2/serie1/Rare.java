package ch.epai.ict.m526.theme2.serie1;

public class Rare extends Timbre {

    public int nombreExemplaires;

    Rare(String code, int anneeEmission, String pays, double valeurFaciale, int nombreExemplaires) {
        super(code, anneeEmission, pays, valeurFaciale);
        this.nombreExemplaires = nombreExemplaires;
    }
    Rare(){
        super();
        this.nombreExemplaires = 0;
    }

    public int getExemplaires() {
        return this.nombreExemplaires;
    }
    
    @Override
    public String toString() {
        return "Timbre de code " + this.code + " datant de " + this.anneeEmission + " (provenance " + this.pays + ") ayant pour valeur faciale "
        + this.valeurFaciale + " francs.\nNombre d'exemplaires -> " + this.nombreExemplaires;
    }
    @Override
    public double vente() {
        double prix = 0;
        int ageTimbre = ANNEE_COURANTE - this.anneeEmission;
        if (this.nombreExemplaires <= BASE_1_EXEMPLAIRES) {
            prix = PRIX_BASE_1 * (ageTimbre / 10.0);
        }else if (this.nombreExemplaires > BASE_1_EXEMPLAIRES && this.nombreExemplaires < BASE_2_EXEMPLAIRES){
            prix = PRIX_BASE_2 * (ageTimbre / 10.0);
        }else{
            prix = PRIX_BASE_3 * (ageTimbre / 10.0);
        }
        return prix;
    }
}