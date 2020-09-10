package com.thirdhand;

public  class Rectangle extends Shape {
	float length,breadth;

	public Rectangle() {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	public float calculatePerimeter(float length , float breadth)
	{
		return (length+breadth)*2;
	}
	

}
