import java.util.Scanner;

public class exercise2 {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int arrayLength;
        System.out.println("Enter array length: ");
        arrayLength = in.nextInt();
        int[] array = new int[arrayLength];
        
        for (int arrayNumbers = 0; arrayNumbers < arrayLength; arrayNumbers++) {
            System.out.println("Enter number " + (arrayNumbers+1));
            array[arrayNumbers] = in.nextInt();
        }
        System.out.println("Enter a value");
        int num = in.nextInt();
	}
	public static void searchArray(int[] array, int num) {
			for ( int i = 0; i < array.length; i++ ) {
				if (array[i] == num) {
					System.out.println("Found " + num + "at Index " + i);
			}
		}
	}
}

