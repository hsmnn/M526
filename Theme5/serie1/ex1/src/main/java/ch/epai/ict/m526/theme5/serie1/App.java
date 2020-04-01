package ch.epai.ict.m526.theme5.serie1;

public class App 
{
    public static void main( String[] args )
    {
        Polygone carre = new Polygone(4, 4, "carre");
        Polygone pentagone = new Polygone(5, 5, "pentagone");

        pentagone.toString(pentagone);
        carre.toString(carre);

        pentagone.presqueClone(pentagone, "octogone", 6);

        pentagone.getAllDescription();

        System.out.println("Le polygone le plus petit est:");
        carre.plusPetit(carre, pentagone);
    }
}