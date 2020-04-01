package ch.epai.ict.m526.theme5.serie1;

public class App 
{
    public static void main( String[] args )
    {
        Polygone carre = new Polygone(4, 4, "Carré");
        Polygone pentagone = new Polygone(5, 5, "Pentagone");

        System.out.print(carre.getName() + carre.getNumberSide() + carre.getPerimeter() + carre.getSizeSide());
    }
}