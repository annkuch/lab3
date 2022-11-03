package com.mypack.controller;
import com.mypack.model.*;
import com.mypack.view.View;
import java.util.*;
public class MainController {
    static View view =new View();
    static Shape[] arr = new Shape[12];
    public static void main(String[] args) {
        arr=arrayGenerator();
        Scanner sc = new Scanner(System.in);
        view.menu();
        int k = sc.nextInt();
        switch (k) {
            case 1 -> System.out.println(Arrays.toString(arrayGenerator()));
            case 2 -> {
                System.out.println("General area of the figures:");
                System.out.println(CalcAllArea());
            }
            case 3 -> {
                view.menutype();
                int m = sc.nextInt();
                System.out.println("The area of the selected figure is:");
                switch (m) {
                    case 1 -> System.out.println(CalcRectArea());
                    case 2 -> System.out.println(CalcTrArea());
                    case 3 -> System.out.println(CalcCircleArea());
                }
            }
            case 4 -> {
                Arrays.sort(arr, new Comparator<Shape>() {
                    @Override
                    public int compare(Shape o1, Shape o2) {
                        Double sides1 = o1.calcArea();
                        Double sides2 = o2.calcArea();
                        return sides1.compareTo(sides2);
                    }
                });
                System.out.println(Arrays.toString(arr));
            }
            case 5 -> {
                Arrays.sort(arr, new Comparator<Shape>() {
                    @Override
                    public int compare(Shape o1, Shape o2) {
                        return o1.shapeColor.compareTo(o2.shapeColor);
                    }
                });
                System.out.println(Arrays.toString(arr));
            }
            default -> view.entererror();
        }

    }
    public static Rectangle rectangleGenerator(String color, double height, double width) {
        Rectangle rectangle = new Rectangle(color);
        rectangle.setHeight(height);
        rectangle.setWidth(width);
        return rectangle;
    }
    public static Triangle triangleGenerator(String color, double a, double b, double c) {
        Triangle triangle = new Triangle(color);
        triangle.setA(a);
        triangle.setB(b);
        triangle.setC(c);
        return triangle;
    }
    public static Circle circleGenerator(String color, double radius) {
        Circle circle = new Circle(color);
        circle.setRadius(radius);
        return circle;
    }
    public static Shape[] arrayGenerator(){
        Rectangle rectangle1 = rectangleGenerator("red", 4, 5);
        Rectangle rectangle2 = rectangleGenerator("blue", 10, 3.6);
        Rectangle rectangle3 = rectangleGenerator("white", 2, 7.5);
        Rectangle rectangle4 = rectangleGenerator("red", 34, 88.5);
        Triangle triangle1 = triangleGenerator("pink",4 ,2 ,3);
        Triangle triangle2 = triangleGenerator("blue",7 ,6 ,4);
        Triangle triangle3 = triangleGenerator("orange",5 ,5 ,5);
        Triangle triangle4 = triangleGenerator("blue",12 ,12 ,10);
        Circle circle1 =circleGenerator("rose",6);
        Circle circle2 =circleGenerator("green",10);
        Circle circle3 =circleGenerator("yellow",23);
        Circle circle4 =circleGenerator("grey",8);
        arr[0]=rectangle1;
        arr[1]=rectangle2;
        arr[2]=rectangle3;
        arr[3]=rectangle4;
        arr[4]=triangle1;
        arr[5]=triangle2;
        arr[6]=triangle3;
        arr[7]=triangle4;
        arr[8]=circle1;
        arr[9]=circle2;
        arr[10]=circle3;
        arr[11]=circle4;
        return arr;
    }
    public static double CalcAllArea(){
        double sum=0;
        for (Shape shape : arr) {
            sum = sum + shape.calcArea();
        }
        return  sum;
    }
    public static double CalcTrArea(){
        double sum=0;
        for (Shape shape : arr) {
            if (shape instanceof Triangle)
                sum = sum + shape.calcArea();
        }
        return  sum;
    }
    public static double CalcRectArea(){
        double sum=0;
        for (Shape shape : arr) {
            if (shape instanceof Rectangle)
                sum = sum + shape.calcArea();
        }
        return  sum;
    }
    public static double CalcCircleArea(){
        double sum=0;
        for (Shape shape : arr) {
            if (shape instanceof Circle)
                sum = sum + shape.calcArea();
        }
        return  sum;
    }
}
