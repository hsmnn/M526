package ch.epai.ict.m526.theme2.serie1;

public class Commemoratif extends Timbre {

    Commemoratif(String code, int anneeEmission, String pays, double valeurFaciale) {
        super(code, anneeEmission, pays, valeurFaciale);
    }
    
    Commemoratif() {
        super();
    }

    @Override
    public String toString() {
        return "Timbre de code " + this.code + " datant de " + this.anneeEmission + " (provenance " + this.pays + ") ayant pour valeur faciale "
        + this.valeurFaciale + " francs.\nTimbre celebrant un evenement.";
    }
}