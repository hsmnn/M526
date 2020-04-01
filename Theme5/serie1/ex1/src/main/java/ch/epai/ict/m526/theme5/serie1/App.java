package ch.epai.ict.m526.theme5.serie1;

public class App 
{
    public static void main( String[] args )
    {
        Polygone carre = new Polygone(4, 4, "Carré");
        Polygone pentagone = new Polygone(5, 5, "Pentagone");

        pentagone.toString(pentagone);
        carre.toString(carre);
    }
}