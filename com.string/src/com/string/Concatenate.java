package com.string;
import java.util.*;
public class Concatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Humpty's Sentence:");
		String a=sc.nextLine();
		System.out.println("Enter the Dumpty's Sentence:");
		String b=sc.nextLine();
		String c=a+'.'+b;
		System.out.println("Concatenated String :"+c);
		
	}

}
