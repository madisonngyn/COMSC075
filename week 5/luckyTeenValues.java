import java.util.Scanner;

public class luckyTeenValues {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int a = in.nextInt();
		 
		System.out.print("Enter a second number: ");
		int b = in.nextInt();
		 
		System.out.print("The sum is: " + (teenSum(a, b)));
	}

	public static int teenSum (int a, int b) {
		if (a >= 13 && a <= 19 || b >= 13 && b <= 19) {
			return 19;
		} else {
			return (a + b);
		}
	}
 }

