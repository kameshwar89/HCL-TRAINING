package com.exception;
import java.util.*;
public class Exception{

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cost of the item for n days");
		int days = sc.nextInt();
		System.out.println("Enter the value of n");
		int value = sc.nextInt();
		try {
			System.out.println("Cost per day of the item is "+days/value);
			
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}

	}

}
