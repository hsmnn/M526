package ch.epai.ict.m526.theme3.serie1;

public class Rectangle extends Shape {
    private double largeur;
    private double longueur;

    Rectangle(int x, int y, double largeur, double longueur) {
        super(x, y);
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public double getPerimeter() {
        return (largeur * 2) + (longueur * 2);
    }

    public double getArea() {
        return this.largeur * this.longueur;
    }

    public boolean equals(Rectangle rectangle) {
        boolean isEquals = false;
        if ((this.largeur == rectangle.largeur) && (this.longueur == rectangle.longueur)) {
            isEquals = true;
        } else {
            isEquals = false;
        }
        return isEquals;
    }
}