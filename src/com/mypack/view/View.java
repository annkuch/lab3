package com.mypack.view;

import java.util.Scanner;

public class View {
    public void menu()
    {
        System.out.println("1-display the data set");
        System.out.println("2-calculate the total area of all figures of the data set");
        System.out.println("3-calculate the total area of figures of a given type");
        System.out.println("4-sort the data set to increase the area of the shapes");
        System.out.println("5-sort the dataset by shape color");
        System.out.println("Enter the action number:");
    }
    public void menutype() {
        System.out.println("1-Rectangle");
        System.out.println("2-Triangle");
        System.out.println("3-Circle");
    }
    public void entererror(){
        System.out.println("False imput!");
    }
}
