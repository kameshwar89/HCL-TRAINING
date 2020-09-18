package collections5;
import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hash_Set =new HashSet<>();
		Scanner keyboard = new Scanner(System.in);
		String input;
		do {
		System.out.println("Enter the username");
		String name = keyboard.nextLine();
		hash_Set.add(name);
		System.out.println("Do you want to continue?(y/n)");
	    input = keyboard.nextLine();
		//keyboard.nextLine();
		}while(input.equals("y"));
		System.out.println("The unique number of usernames is "+hash_Set.size());
	}

}
