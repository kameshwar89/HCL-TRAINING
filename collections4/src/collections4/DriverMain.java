package collections4;

import java.util.ArrayList;
import java.util.*;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<RemoveAll> ArrList = new ArrayList<>();
		String setOfInput,name,contactNumber,userName,email;
		int i=1;
		Scanner keyboard = new Scanner(System.in);
		do {
		setOfInput = keyboard.nextLine();
		String input[]=setOfInput.split(",");
		name=input[0];
		contactNumber = input[1];
		userName=input[2];
		email=input[3];
		RemoveAll ra=new RemoveAll(name,contactNumber,userName,email);
		ArrList.add(ra);
		i++;
		}while(i<3);
		for(RemoveAll list :ArrList)
			System.out.println(list);
		System.out.println("Enter the range to be removed from array list");
		int startIndex,endingIndex;
		startIndex=keyboard.nextInt();
		endingIndex=keyboard.nextInt();
		
		for(RemoveAll list :ArrList)
			System.out.println(list);
		
		
	}

}
