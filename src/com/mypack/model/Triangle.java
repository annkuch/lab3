package com.mypack.model;
import static java.lang.Math.sqrt;
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor) {
        super(shapeColor);
    }

    public void setA(double a) {

        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double calcArea() {
        return 0.25*sqrt((a+b+c)*(b+c-a)*(a+c-b)*(a+b-c));
    }

    @Override
    public String toString() {
        String type = "Triangle";
        return "\n"+type + " {" +
                "color = " + shapeColor +
                "; area = " + calcArea() +
                "}";
    }
}
