package com.thirdhand;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("List of Shapes:");
		Scanner s = new Scanner(System.in);
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.println("3.Square");
		System.out.println("Enter the choice");
		int n = s.nextInt();
		switch (n) {
		case 1:
			System.out.println("Enter the length of the Rectangle");
			float length = s.nextFloat();
			System.out.println("Enter the bredth of the Rectangle:");
			float breadth = s.nextFloat();
			Rectangle rect=new Rectangle();
			System.out.println("The perimeter :"+String.format("%.2f",rect.calculatePerimeter(length,breadth)));
			break;
		case 2:
			System.out.println("Enter the radius of the Circle:");
			float radius = s.nextFloat();
			Circle cir=new Circle();
			System.out.println("The perimeter :"+String.format("%.2f",cir.calculatePerimeter(radius)));
		    break;
		case 3:
			System.out.println("Enter the side of the Square:");
			float side = s.nextFloat();
			Square squ = new Square();
			System.out.println("The perimeter :"+String.format("%.2f",squ.calculatePerimeter(side)));
			break;
			
			
		}
		
		
		
	}

}
