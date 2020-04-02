package ch.epai.ict.m526.theme5.serie2;

public class Segment implements Forme {
    private Point pt1;
    private Point pt2;

    Segment(Point pt1, Point pt2) {
        this.pt1 = pt1;
        this.pt2 = pt2;
    }

    public Point getPt1() {
        return this.pt1;
    }

    public Point getPt2() {
        return this.pt2;
    }

    @Override
    public String toString() {
        return "Segment délimité par les points (" + this.pt1.getX() + ", " + this.pt1.getY() + ") et (" + this.pt2.getX() + ", " + this.pt2.getY() + ")";
    }

    public Point centre() {
        int midX = (pt1.getX() + pt2.getX()) / 2;
        int midY = (pt1.getY() + pt2.getY()) / 2;
        Point mid = new Point(midX, midY);
        return mid;
    }

    public void dessine() {
        System.out.println("A la règle: " + toString());
    }

    public double longueur() {
        return Math.sqrt(Math.pow((pt1.getX() - pt2.getX()), 2) + (Math.pow((pt1.getY() - pt2.getY()), 2)));
    }
}