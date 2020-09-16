package collections3;

import java.util.ArrayList;
import java.util.Scanner;

public class HallArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ListArr = new ArrayList<>();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of halls:");
		int numOfHalls = keyboard.nextInt();
		keyboard.nextLine();

		for (int i = 1; i <= numOfHalls; i++) {
			System.out.println("Enter the Hall Name " + i);
			String HallName = keyboard.nextLine();
			ListArr.add(HallName);
		}
			System.out.println("Enter the hall name to be Searched:");
			String SearchHall = keyboard.nextLine();
			if (ListArr.contains(SearchHall)) {
				System.out
						.println(SearchHall + " hall is found in the list at position " + ListArr.indexOf(SearchHall));
			} else {
				System.out.println(SearchHall + " hall is not found:");
			}

	}

}
