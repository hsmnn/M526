package ch.epai.ict.m526.theme3.serie1;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    Triangle(int x, int y, double a, double b, double c) {
        super(x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        double area = Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
        return area;
    }

    public boolean equals(Triangle triangle) {
        boolean isEquals = false;
        if (this.getCenter() == triangle.getCenter()){
            isEquals = true;
        } else {
            isEquals = false;
        }
        return isEquals;
    }
}