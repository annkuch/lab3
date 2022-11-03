package com.mypack.model;

public class Circle extends Shape {
    private double radius;

    public Circle(String shapeColor) {
        super(shapeColor);
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double calcArea() {
        return Math.PI* Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        String type = "Circle";
        return "\n"+type + " {"+
                "color = " + shapeColor +
                "; area = " + calcArea() +
                "}";
    }
}
