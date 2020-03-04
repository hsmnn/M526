package ch.epai.ict.m526.theme2.serie1;

/**
 * La classe Commemoratif représente les timbres commémoratifs
 * 
 * @author Elie Hausmann
 * @version 1.0
 * @since 1.0
 */
public class Commemoratif extends Timbre {

    Commemoratif(String code, int anneeEmission, String pays, double valeurFaciale) {
        super(code, anneeEmission, pays, valeurFaciale);
    }
    
    Commemoratif() {
        super();
    }

    /**
     * La méthode toString surcharge la méthode toString de la classe mère : Timbre.
     * Elle renvoi une description du timbre commémoratif.
     * 
     * @author Elie Hausmann
     * @version 1.0
     * @return Une chaîne de caractère contenant la description
     * @since 1.0
     */
    @Override
    public String toString() {
        return "Timbre de code " + this.code + " datant de " + this.anneeEmission + " (provenance " + this.pays + ") ayant pour valeur faciale "
        + this.valeurFaciale + " francs.\nTimbre celebrant un evenement.";
    }
}