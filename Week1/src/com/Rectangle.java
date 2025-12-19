package com;

public class Rectangle extends Shape  {
	double length;
	double width;
	Rectangle(String name,double length, double width) {
		super(name, 2);
		this.length=length;
		this.width=width;
		// TODO Auto-generated constructor stub
	}
	public double area() {
		// TODO Auto-generated method stub
		return length*width;
	}
	
 
	
}
