import java.util.*;
public class Players {
    public static void main(String[] args) {
    String data;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the player details");
    data=s.nextLine();
    String arr[]=data.split(",");
    String name=arr[0];
    String country=arr[1];
    String skill=arr[2];
    Details d=new Details(name,country,skill);
    System.out.println("Player Details");
    System.out.println("Player name:"+d.getName());
    System.out.println("Country name:"+d.getCountry());
    System.out.println("Skill:"+d.getSkill());    
}
}
