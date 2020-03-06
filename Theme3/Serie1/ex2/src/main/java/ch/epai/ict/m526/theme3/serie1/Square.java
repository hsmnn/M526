package ch.epai.ict.m526.theme3.serie1;

public class Square extends Shape {
    private double side;

    Square(double side, int x, int y) {
        super(x, y);
        this.side = side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public double getArea() {
        return Math.pow(this.side, 2);
    }

    public boolean equals(Square square) {
        boolean isEquals = false;
        if (this.side == square.side) {
            isEquals = true;
        } else {
            isEquals = false;
        }
        return isEquals;
    }
}