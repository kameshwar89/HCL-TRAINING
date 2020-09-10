package com.thirdhand;

public class Circle extends Shape {
	float radius;

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float calculatePerimeter(float radius)
	{
		return (float) (6.28*radius);
	}


}
