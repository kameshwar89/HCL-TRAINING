package collections2;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ItemType> list = new ArrayList<>();
		String a, d;
		double b, c;
		do {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the details of Item Type :");
		System.out.println("Name :");
		a = s.nextLine();
		System.out.println("Deposit :");
		b = s.nextDouble();
		System.out.println("Cost Per Day :");
		c = s.nextDouble();
		System.out.println("Do you want to continue?(y/n)");
		s.nextLine();
		d = s.nextLine();
		ItemType gc =new ItemType(a,b,c);
		list.add(gc);
		}while(d.equals("y"));
		System.out.println("Name     Deposit     CostPerDay");
		for(ItemType cd:list)
			System.out.println(cd);
		}
	}

	
