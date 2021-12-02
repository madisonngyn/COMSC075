
/*
 * Write the following method that returns the sum of all numbers in an ArrayList
	public static int sumList (ArrayList <Integer> list)
*/

import java.util.Scanner;
import java.util.ArrayList;

public class sumOfArrayList {
    
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
        System.out.println("Enter 5 numbers: ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
			list.add(in.nextInt());
		}
		System.out.println("Sum of list: " + sumList(list));
    }
    
    public static int sumList(ArrayList <Integer> list) {
        int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += list.get(i);
            }
        return sum;
    }
}
