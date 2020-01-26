package ch.epai.ict.m526.serie1;

public class Cercle {
    private double yA;
    private double xA;
    private double r;

    Cercle(double xA, double yA, double r) {
        setX(xA);
        setY(yA);
        setR(r);
    }

    public void setX(double xA) {
        this.xA = xA;
    }

    public void setY(double yA) {
        this.yA = yA;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getXA() {
        return this.xA;
    }

    public double getYA() {
        return this.yA;
    }

    public double getR() {
        return this.r;
    }

    public double getPerimetre() {
        return (double) (2 * 3.14 * this.r);
    }

    public double getSurface() {
        return (double) (3.14 * (this.r * this.r));
    }

    public String appartient(double xB, double yB) {
        String appartient = "";
        double distanceAB =  Math.pow(2, (xB - xA)) + Math.pow(2, (yB - yA));
        if (distanceAB <= this.r){
            appartient = "Le point appartient au cercle";
        }else{
            appartient = "Le point n'appartient pas au cercle";
        }
        return appartient;
    }
}