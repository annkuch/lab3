package com.mypack.model;
public class Rectangle extends Shape {
    private double height;
    private double width;
    public Rectangle(String shapeColor) {
        super(shapeColor);
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
     @Override
    public double calcArea() {
        return height*width;
    }

    @Override
    public String toString() {
        String type = "Rectangle";
        return  "\n"+type + " {" +
                "color = " + shapeColor+
                "; area = " + calcArea() +
                "}";
    }
}
