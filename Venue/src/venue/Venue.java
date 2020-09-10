
package venue;
import java.util.*;

public class Venue {

    public static void main(String[] args) {
        System.out.println("Enter the venue name");
        Scanner s= new Scanner(System.in);
        String name=s.nextLine();
        System.out.println("Enter the city name");
        String city=s.nextLine();
        s.nextLine();
        Updates updates= new Updates();
        updates.setName(name);
        //updates.setCity(city);
                
        System.out.println("Venue Details");
        System.out.println("venue Name:"+u.getName());
        //System.out.println("City name:"+u.getCity());
        System.out.println("")
        
        
    }
    
}ed