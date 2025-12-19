package com;

public class Circle extends Shape {
    double radius;
	Circle(String name, double radius) {
		super(name,0);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}

	
	public double area() {
		// TODO Auto-generated method stub
		return 3.142*radius*radius;
	}

}
