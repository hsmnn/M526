package ch.epai.ict.m526.theme5.serie1;

import java.util.ArrayList;

public class Polygone {
    private String name;
    private int numberSide;
    private int sizeSide;
    private int perimeter;
    private ArrayList<Polygone> listPolygone;

    Polygone() {
        this.name = "";
        this.numberSide = 0;
        this.sizeSide = 0;
        this.perimeter = 0;
        this.listPolygone = new ArrayList<Polygone>();
    }

    Polygone(int numberSide, int sizeSide, String name) {
        this.numberSide = numberSide;
        this.sizeSide = sizeSide;
        this.name = name;
        this.perimeter = perim();
        this.listPolygone = new ArrayList<Polygone>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setNumberSide(int number) {
        this.numberSide = number;
    }

    public int getNumberSide() {
        return this.numberSide;
    }

    public void setSizeSide(int size) {
        this.sizeSide = size;
    }

    public int getSizeSide() {
        return this.sizeSide;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public int getPerimeter() {
        return this.perimeter;
    }

    public void toString(Polygone poly) {
        System.out.println("Nom : " + poly.name + ", nombre de côté : " + poly.numberSide + ", taille des côtés : " + poly.sizeSide + ", périmètre : " + poly.perimeter);
    }

    public int perim() {
        return this.numberSide * this.sizeSide;
    }
}

