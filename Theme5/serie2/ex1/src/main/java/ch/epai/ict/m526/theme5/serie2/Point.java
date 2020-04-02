package ch.epai.ict.m526.theme5.serie2;

public class Point {
    protected int x;
    protected int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public void dist() {
        double x = this.x;
        double y = this.y;
        double givenX = 0;
        double givenY = 0;
        double dist = Math.sqrt(Math.pow((givenX - x), 2) + (Math.pow((givenY - y), 2)));
    }
}