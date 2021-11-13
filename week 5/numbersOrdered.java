import java.util.Scanner;

public class numbersOrdered {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num1 = in.nextInt();
		
		System.out.println("Enter a second number: ");
		int num2 = in.nextInt();
		
		System.out.println("Enter a third number: ");
		int num3 = in.nextInt();
		
		System.out.print("The numbers in increasing order are: ");
			numberRank(num1, num2, num3);
	}
	
	public static void numberRank (int num1, int num2, int num3) {
		if (num1 < num2 && num1 < num3) {
			System.out.print(num1);
				if (num2 < num3)
					System.out.println(", " + num2 + ", " + num3);
				else 
					System.out.println(", " + num3 + ", " + num2);
		}
		else if (num2 < num1 && num2 < num3) {
			System.out.print(num2);
				if (num1 < num3)
					System.out.println(", " + num1 + ", " + num3);
				else 
					System.out.println(", " + num3 + ", " + num1);
		}
		else if (num3 < num1 && num3 < num2) {
			System.out.print(num3);
				if (num1 < num2)
					System.out.println(", " + num1 + ", " + num2);
				else 
					System.out.println(", " + num2 + ", " + num1);
		}
	}
}



