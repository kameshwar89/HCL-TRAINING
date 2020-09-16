package com.string5;

import java.util.Scanner;

public class DeleteString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String a= s.nextLine();
		System.out.println("Dumpty Says :"+a);
		System.out.println("What Dumpty want to Remove?");
		String b = s.nextLine();
		String remove = a.replace(b,"");
		System.out.println("Dumpty's New Sentence :"+remove);
	}

}
