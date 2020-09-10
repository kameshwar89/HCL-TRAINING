package com.thirdhand2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name of the event:");
		String name = s.nextLine();
		System.out.println("Enter the detail of the event");
		String detail = s.nextLine();
		System.out.println("Enter the owner name of the event");
		String ownerName = s.nextLine();
		System.out.println("Enter the type of the event:");
		System.out.println("1.Exhibition");
		System.out.println("2.StageEvent");
		int n = s.nextInt();
		switch (n) {
		case 1:
			System.out.println("Enter the name of the stalls:");
			int noOfStall = s.nextInt();
			Exhibition ex=new Exhibition(ownerName, ownerName, ownerName, noOfStall);
			System.out.println("The project revenue of the event is"+ex.projectedRevenue(noOfStall));
			break;
		case 2:
			System.out.println("Enter the number of shows:");
			int noOfShows=s.nextInt();
			System.out.println("Enter the number of seats per show:");
			int noOfSeats = s.nextInt();
			StageEvent se = new StageEvent(ownerName, ownerName, ownerName, noOfShows, noOfSeats);
			System.out.println("The Projected revenue of the event is"+se.projectedRevenue(noOfShows,noOfSeats));
			break;
		}
		
		
	}

}
