import java.util.Scanner;

public class numbers {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter two numbers: ");
        int numberOne = in.nextInt();
        int numberTwo = in.nextInt();
		
        System.out.print("The sum of these two numbers: ");
        System.out.println(numberOne + numberTwo);
		
        System.out.print("The product of these two numbers: ");
        System.out.println(numberOne * numberTwo);
        
	}
}

