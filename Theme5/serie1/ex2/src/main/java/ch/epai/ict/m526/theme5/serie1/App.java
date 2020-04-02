package ch.epai.ict.m526.theme5.serie1;

public class App 
{
    public static void main( String[] args )
    {
        Point point = new Point(2, 4);
        Point point2 = new Point (3, 6);
        Cercle cercle = new Cercle(6, point);
        Segment seg = new Segment(point, point2);
        Forme tab[] = new Forme[3];
        tab[0] = cercle;
        tab[1] = seg;
        tab[2] = new Cercle(12, point2);
    }
}
