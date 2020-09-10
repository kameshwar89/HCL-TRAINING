package com.exception3;
import java.util.*;
public class InputMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stubte
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer input:");
		int n = sc.nextInt();
		try {
			System.out.println("Entered value is "+n);
		}
		catch (InputMismatchException ime) {
			ime.getMessage();
		}

	}

}
