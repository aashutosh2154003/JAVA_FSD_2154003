package com;

import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> obj= new ArrayList<>();
        obj.add(new Triangle("Triangle", 12.0, 2.0));
        obj.add(new Rectangle("Rectangle", 1.0, 2.0));
        obj.add(new Circle("Circle", 45.0));
        obj.add(new Square("Square", 45.0));
        
        for (Shape shape: obj) {
            System.out.println("Shape: " + shape.getName());
            System.out.println("Area: " + ((Area) shape).area());
            System.out.println();  
            }
    }
}