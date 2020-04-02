package ch.epai.ict.m526.theme5.serie1;

public class Cercle implements Forme{
    private int rayon;
    private Point centre;

    Cercle(int rayon, int x, int y) {
        this.rayon = rayon;
        this.centre = new Point(x, y);
    }

    Cercle(int rayon, Point point) {
        this.rayon = rayon;
        this.centre = point;
    }

    @Override
    public String toString() {
        return "Cercle de centre (" + this.centre.getX() + ", " + this.centre.getY() + ") et de rayon " + this.rayon;
    }

    public Point centre() {
        return this.centre;
    }

    public void dessine() {
        System.out.println("Au compas: " + toString());
    }

    public double longueur(){
        return 2 * 3.14 * rayon;
    }
}