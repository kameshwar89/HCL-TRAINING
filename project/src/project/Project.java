import java.util.*;
public class Project {

    public static void main(String[] args) {
        System.out.println("Enter the venue name");
        Scanner s= new Scanner(System.in);
        String name=s.nextLine();
        System.out.println("Enter the city name");
        String city=s.nextLine();
        Update update= new Update();
        update.setName(name);
        update.setCity(city);
           
        System.out.println("Venue Details");
        System.out.println("venue Name:"+update.getName());
        System.out.println("City name:"+update.getCity());
        System.out.println("");
        
        
    }
    
}