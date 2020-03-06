package ch.epai.ict.m526.theme3.serie1;

public class Circle extends Shape {
    private double rayon;

    Circle(int x, int y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    public double getPerimeter() {
        return 2 * 3.14 * this.rayon;
    }

    public double getArea() {
        return 3.14 * Math.pow(this.rayon, 2);
    }

    public boolean equals(Circle circle) {
        boolean isEquals = false;
        if (this.rayon == circle.rayon) {
            isEquals = true;
        } else {
            isEquals = false;
        }
        return isEquals;
    }
}