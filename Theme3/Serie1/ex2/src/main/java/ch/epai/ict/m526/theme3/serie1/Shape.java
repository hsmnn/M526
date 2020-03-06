package ch.epai.ict.m526.theme3.serie1;

abstract class Shape {
    protected Point center;

    Shape(int x, int y){
        this.center = new Point(x, y);
    }

    public Point getCenter() {
        return this.center;
    }
}