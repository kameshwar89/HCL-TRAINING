package com.carservice;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1,year;
		String brands;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your car number");
		sum1=scan.nextInt();
		System.out.println("How many years old car do you have");
		year=scan.nextInt();
		System.out.println("Car brand");
		scan.nextLine();
		brands=scan.nextLine();
		Car car = new Service(sum1,year,brands);
		car.sum();
		car.brand();
		car.years();
		
	}

}
