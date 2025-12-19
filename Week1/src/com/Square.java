package com;

public class Square extends Shape {
	double d;
	Square(String name, double d) {
		super(name, 2);
		this.d=d;
		// TODO Auto-generated constructor stub
	}

	
	public double area() {
		// TODO Auto-generated method stub
		return d*d;
	}
	
}
