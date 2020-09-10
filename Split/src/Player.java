import java.util.Scanner;
public class Player {

	public static void main(String[] args) {
		String data;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Player Details");
		data=s.nextLine();
		String a[]=data.split(",");
		String name=a[0];
		String country =a[1];
		String skill=a[2];
		Sports p=new sports(name,country,skill);
		System.out.println("Player Details");
		System.out.println("Player name:" +p.getName());
		System.out.println("Player country:"+p.getCountry());
		System.out.println("Player Skill:"+p.getSkill());
		

	}

}
