package com.interface1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ChooseStall Type");
		System.out.println("1)Gold Stall");
		System.out.println("2)Premium Stall");
		System.out.println("3)Executive Stall");
		Scanner s = new Scanner(System.in);
		int n  = s.nextInt();
		s.nextLine();
		if(n==1) {
			System.out.println("Enter Stall details in comma seperated");
			String detail = s.nextLine();
			String value[]=detail.split(",");
			String stallName = value[0];
			int cost = Integer.parseInt(value[1]);
			String ownerName = value[2];
			int tvSet = Integer.parseInt(value[3]);
			Stall stall = new GoldStall(stallName, cost, ownerName, tvSet);
			stall.display();
		}
		else if(n==2)
		{
			System.out.println("Enter Stall details in comma seperated");
			String detail = s.nextLine();
			String value[]=detail.split(",");
			String stallName = value[0];
			int cost = Integer.parseInt(value[1]);
			String ownerName = value[2];
			int projector = Integer.parseInt(value[3]);
			Stall stall = new PremiumStall(stallName, cost, ownerName, projector);
			stall.display();
		}
		else
		{
			System.out.println("Enter Stall details in comma seperated");
			String detail = s.nextLine();
			String value[]=detail.split(",");
			String stallName = value[0];
			int cost = Integer.parseInt(value[1]);
			String ownerName = value[2];
			int projector = Integer.parseInt(value[3]);
			Stall stall = new ExecutiveStall(stallName, cost, ownerName, projector);
			stall.display();
		}
	}

}
