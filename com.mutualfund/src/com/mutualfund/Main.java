package com.mutualfund;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you want to invest:");
		int amount = sc.nextInt();
		System.out.println("Enter the tenure of the SIP");
		int duration = sc.nextInt();
		MutualFund mf = new AxisBank(amount,duration);
		System.out.println("AxisBank:-");
		mf.amounts();
		MutualFund mf2 = new ICICI(amount,duration);
		System.out.println("ICICI:-");
		mf2.amounts();
		MutualFund mf1 = new HDFC(amount,duration);
		System.out.println("HDFC:-");
		mf1.amounts();
	}

}
