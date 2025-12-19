package com;

public abstract class Shape implements Area{
	String name;
	int side;
	
	Shape(String name, int side){
		this.name=name;
		this.side=side;
	}

	public String getName() {
		return name;
	}

	

	public int getSide() {
		return side;
	}
	
}
