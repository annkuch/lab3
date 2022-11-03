package com.mypack.model;
public abstract class Shape implements Drawable {
    public String shapeColor;
    public abstract double calcArea();
    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }
    @Override
    public String toString() {
        return "Shape { " +
                "shapeColor = " + shapeColor + "}"+"\n";
    }
    @Override
    public void draw() {

    }

}
