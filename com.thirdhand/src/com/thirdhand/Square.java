package com.thirdhand;

public class Square extends Shape {
	float side;

	public Square(float side) {
		super();
		this.side = side;
	}
	public Square() {
		// TODO Auto-generated constructor stub
	}
	public float getSide() {
		return side;
	}
	public void setSide(float side) {
		this.side = side;
	}
	public float calculatePerimeter(float side)
	{
		return 4*side;
	}

}
