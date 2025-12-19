package com;
public class Triangle extends Shape {
	double breath;
	double height;
	
	public Triangle(String name, double breath, double height) {
    super(name, 3);  
    this. breath= breath;
    this.height = height;
}
	


public double area() {
    return (breath * height) / 0.5;
}

	
}

