import java.util.Scanner;

public class temperature {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a temperature in celsius: ");
        double celsius = in.nextDouble();
        double fahrenheit = (celsius * 9/5 + 32);
        
        System.out.printf(" %.1f C = %.1f F" , celsius, fahrenheit);
        
	}
}

