
import java.util.ArrayList;

public class stateCapitals {
    public static void main(String[] args) {
        
        // Create ArrayList
        ArrayList <String> capitalCity = new ArrayList<>();
        
        // Add capital cities
        capitalCity.add("Sacramento");
        capitalCity.add("Salem");
        capitalCity.add("Olympia");
        capitalCity.add("Nashville");
        capitalCity.add("Austin");
        
        // Finding size of ArrayList. 
        System.out.println("The size of the array list is " + capitalCity.size() + ".");
        
        // Using a for loop, print out the contents of the ArrayList
        System.out.print("The contents of the ArrayList are ");
        
        for (int i = 0; i < capitalCity.size(); i++) {
            System.out.print(capitalCity.get(i));
            System.out.print(", ");
        }
    }
}

