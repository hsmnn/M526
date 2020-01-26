package ch.epai.ict.m526.serie1;

/**
 * Création de la classe Point.
 * 
 * @author Elie Hausmann
 * @version 1.0
 * @since 1.0
 */

public class Point {
    private double abscisse;
    private double ordonne;

    /**
     * Création du constructeur qui initialise les variables membres
     * @param abscisse
     * @param ordonne
     */
    Point(double abscisse, double ordonne) {
        setAbscisse(abscisse);
        setOrdonne(ordonne);
    }

    /**
     * La procédure setAbscisse modifie la variable membre abscisse.
     * Elle vérifie si la valeur du paramètre est négatif auquel cas, elle la remplace par sa valeur absolue.
     * @param abscisse
     */
    public void setAbscisse(double abscisse) {
        if (abscisse < 0){
            this.abscisse = Math.abs(abscisse);
        }else{
            this.abscisse = abscisse;
        }
    }

    /**
     * La fonction getAbscisse doit retourner la variable membre abscisse
     * @return
     */
    public double getAbscisse(){
        return this.abscisse;
    }

    /**
     * La procédure setOrdonne modifie la variable membre ordonne.
     * Elle vérifie si la valeur du paramètre est négatif auquel cas, elle la remplace par sa valeur absolue.
     * @param ordonne
     */
    public void setOrdonne(double ordonne){
        if (ordonne < 0){
            this.ordonne = Math.abs(ordonne);
        }else{
            this.ordonne = ordonne;
        }
    }

    /**
     * La fonction getOrdonne doit retourner la variable membre ordonne
     * @return
     */
    public double getOrdonne(){
        return this.ordonne;
    }

    /**
     * La fonction norme calcule la distance entre l'origine et le point entré par l'utilisateur.
     * Elle doit retourner le résultat de ce calcul.
     * @return
     */
    public double norme(){
        double result = Math.sqrt((this.abscisse * this.abscisse) + (this.ordonne * this.ordonne));
        return result;
    }
}