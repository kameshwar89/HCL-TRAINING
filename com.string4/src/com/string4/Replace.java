package com.string4;
import java.util.*;
public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Humpty's Sentence :");
		String a= s.nextLine();
		System.out.println("Word To Replace ");
		String b = s.nextLine();
		System.out.println("Synonym :");
		String c=s.nextLine();
		String replace=a.replace(b, c);
		System.out.println("Replaced String :"+replace);
	 
	}

}
