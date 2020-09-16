package com.string3;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder input1=new StringBuilder();
		System.out.println("Enter Humpty's Sentence :");
		String s = sc.nextLine();
		input1.append(s); 
	    input1 = input1.reverse(); 
		System.out.println("Dumpty Says,"+input1);
	}

	

}
