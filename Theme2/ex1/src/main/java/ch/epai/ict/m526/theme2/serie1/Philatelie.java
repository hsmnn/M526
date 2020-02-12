package ch.epai.ict.m526.theme2.serie1;

import java.util.ArrayList;

class Timbre {

    public static final int ANNEE_COURANTE = 2020;
    public static final double VALEUR_TIMBRE_DEFAUT = 1;
    public static final String PAYS_DEFAUT = "Suisse";
    public static final String CODE_DEFAUT = "lambda";

    public static final int BASE_1_EXEMPLAIRES = 100;
    public static final int BASE_2_EXEMPLAIRES = 1000;
    public static final double PRIX_BASE_1 = 600;
    public static final double PRIX_BASE_2 = 400;
    public static final double PRIX_BASE_3 = 50;

    /*******************************************
     * Completez le programme a partir d'ici.
     *******************************************/

    public String code;
    public int anneeEmission;
    public String pays;
    public double valeurFaciale;

    Timbre(String code, int anneeEmission, String pays, double valeurFaciale) {
        this.code = code;
        this.anneeEmission = anneeEmission;
        this.pays = pays;
        this.valeurFaciale = valeurFaciale;
    }
    Timbre() {
        this.code = CODE_DEFAUT;
        this.anneeEmission = ANNEE_COURANTE;
        this.pays = PAYS_DEFAUT;
        this.valeurFaciale = VALEUR_TIMBRE_DEFAUT;
    }

    /**
     * La méthode vente calcule le prix de vente d'un timbre en fonction de son âge
     * 
     * @author Elie Hausmann
     * @version 1.0
     * @return le prix de vente en double
     * @since 1.0
     */
    public double vente() {
        int ageTimbre = ANNEE_COURANTE - this.anneeEmission;
        double prix = 0;
        if (ageTimbre <= 5){
            prix = this.valeurFaciale;
        } else {
            prix = this.valeurFaciale * ageTimbre * 2.5;
        }
        return prix;
    }

    /**
     * La méthode toString décrit un timbre en renvoyant son code, son année d'émission, son origine et sa valeur faciale
     * 
     * @author Elie Hausmann
     * @version 1.0
     * @return Une chaîne de caractère contanant la description du timbre
     * @since 1.0
     */
    public String toString() {
        return "Timbre de code " + this.code + " datant de " + this.anneeEmission + " (provenance de " + this.pays + ") ayant pour valeur faciale "
        + this.valeurFaciale + " francs.";
    }

    /**
     * La méthode age calcul l'âge du timbre en fonction de son année d'émission et de l'année courante
     * 
     * @author Elie Hausmann
     * @version 1.0
     * @return l'âge du timbre en int
     * @since 1.0
     */
    public int age() {
        int ageTimbre = ANNEE_COURANTE - this.anneeEmission;
        return ageTimbre;
    }

    /**
     * La methode getCode renvoi la variable membre code. C'est un getter.
     * 
     * @author Elie Hausmann
     * @version 1.0
     * @return la variable membre code
     * @since 1.0
     */
    public String getCode() {
        return this.code;
    }

    /**
     * La methode getAnnee renvoi la valeur de la variable membre anneeEmission. C'est un getter
     * 
     * @author Elie Hausmann
     * @version 1.0
     * @return la valeur de la variable membre anneeEmission
     * @since 1.0
     */
    public int getAnnee() {
        return this.anneeEmission;
    }

    /**
     * La methode getPays renvoi la valeur de la variable membre pays. C'est un getter
     * 
     * @author Elie Hausmann
     * @version 1.0
     * @return la valeur de la variable membre pays
     * @since 1.0
     */
    public String getPays() {
        return this.pays;
    }

    /**
     * La methode getValeurFaciale renvoi la valeur de la variable membre valeurFaciale. C'est un getter
     * 
     * @author Elie Hausmann
     * @version 1.0
     * @return la valeur de la variable membre valeurFaciale
     * @since 1.0
     */
    public double getValeurFaciale() {
        return this.valeurFaciale;
    }
}

/*******************************************
 * Ne rien modifier apres cette ligne.
 *******************************************/

class Philatelie {

    public static void main(String[] args) {

        // ordre des parametres: nom, annee d'emission, pays, valeur faciale,
        // nombre d'exemplaires
        Rare t1 = new Rare("Guarana-4574", 1960, "Mexique", 0.2, 98);

        // ordre des parametres: nom, annee d'emission, pays, valeur faciale
        Commemoratif t2 = new Commemoratif("700eme-501", 2002, "Suisse", 1.5);
        Timbre t3 = new Timbre("Setchuan-302", 2004, "Chine", 0.2);

        Rare t4 = new Rare("Yoddle-201", 1916, "Suisse", 0.8, 3);

        ArrayList<Timbre> collection = new ArrayList<Timbre>();

        collection.add(t1);
        collection.add(t2);
        collection.add(t3);
        collection.add(t4);

        for (Timbre timbre : collection) {
            System.out.println(timbre);
            System.out.println("Prix vente : " + timbre.vente() + " francs");
            System.out.println();
        }
    }
}
