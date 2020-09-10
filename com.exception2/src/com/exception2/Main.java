package com.exception2;
import java.io.*;  
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Item type details:");
		System.out.println("Enter the Name:");
		String name = br.readLine();
		System.out.println("Enter the deposit:");
		float deposit=Float.parseFloat(br.readLine()); 
		System.out.println("Enter the cost per day:");
		float costPerDay =Float.parseFloat(br.readLine());
		ItemType it = new ItemType(name,deposit,costPerDay);
		it.display();
	}

}
