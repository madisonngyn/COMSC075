import java.util.Scanner;

public class indexOfMax {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
      
		int arrayLength;
		System.out.println("Enter array length: ");
		arrayLength = in.nextInt();
		int[] array = new int[arrayLength];
        
		for (int arrayNumbers = 0; arrayNumbers < arrayLength; arrayNumbers++) {
			System.out.println("Enter number " + (arrayNumbers+1));
			array[arrayNumbers] = in.nextInt();
		}
		
		getIndexOfLargest(array);
		System.out.println("The index of the largest number is " + getIndexOfLargest(array));
	}
	
	public static int getIndexOfLargest(int[] array ) {
		int largestNum = array[0];
		int indexOfLargestNum = 0;
		
		for ( int i = 0; i < array.length; i++ ) {
			if (array[i] > largestNum) { 
				largestNum = array[i];
				indexOfLargestNum = i;
		}
	}
		
	return indexOfLargestNum;
	}
}

// I don't think this could be written using an enhanced for loop because we're looking for the specific index of the largest number. An enhanced for loop assigns a copy 
// of each element without an index, so we wouldn't be able to find the index of the largest number using an enhanced for loop.
