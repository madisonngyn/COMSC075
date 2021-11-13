import java.util.Scanner;

public class forLoop {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a positive number:");
		int positiveNumber = in.nextInt();
		
		for (int i = 0; i <= positiveNumber ; i++) {
			System.out.print(i + ", ");
		}
	}
}

