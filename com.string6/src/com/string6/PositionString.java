package com.string6;

import java.util.*;

public class PositionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Humpty's Sentence :");
		String a = s.nextLine();
		System.out.println("Humpty Says :"+a);
		System.out.println("What Dempty want to insert & where?");
		String b= s.nextLine();
		System.out.println("Enter Position :");
		int c = s.nextInt();
		//String position =changeCharInPosition(c, b, position);
		System.out.println("Humpty's New Sentence :"+position);
		
	}

}
