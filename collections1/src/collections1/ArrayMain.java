package collections1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the username 1:");
		String a = s.nextLine();
		names.add(a);
		int i=2;
		do {
		System.out.println("Do you want to continue?(y/n)");
		String b=s.nextLine();
		if(b.equals("y"))
		{
			System.out.println("Enter the username "+i+":");
			String c=s.nextLine();
			names.add(c);
		}
		else 
		{
			System.out.println("The Names entered are:");
			break;
		}
		i++;
		}while(i>0);
		for(String x:names)
			System.out.println(x);
	
	}

}
