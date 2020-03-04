package ch.epai.ict.m526.theme2.serie1;

/**
 * La classe Rare représente les timbres rares.
 * 
 * @author Elie Hausmann
 * @version 1.0
 * @since 1.0
 */
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

    /**
     * La methode getExemplaires renvoi la valeur de la variable membre nombreExemplaires. C'est un getter
     * 
     * @author Elie Hausmann
     * @version 1.0
     * @return la valeur de la variable membre
     * @since 1.0
     */
    public int getExemplaires() {
        return this.nombreExemplaires;
    }
    
    /**
     * La methode toString surcharge la méthode toString de la classe mère.
     * Cette méthode renvoi une chaîne de caractère contenant la description d'un timbre rare.
     * 
     * @author Elie Hausmann
     * @version 1.0
     * @return la description d'un timbre rare
     * @since 1.0
     */
    @Override
    public String toString() {
        return "Timbre de code " + this.code + " datant de " + this.anneeEmission + " (provenance " + this.pays + ") ayant pour valeur faciale "
        + this.valeurFaciale + " francs.\nNombre d'exemplaires -> " + this.nombreExemplaires;
    }

    /**
     * La methode vente calcul le prix de vente d'un timbre rare.
     * Le calcul se fait en fonction d'un prix de base défini par la rareté du timbre, la veillesse du timbre et un coefficient.
     * 
     * @author Elie Hausmann
     * @version 1.0
     * @return Le prix de vente d'un timbre rare
     * @since 1.0
     */
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