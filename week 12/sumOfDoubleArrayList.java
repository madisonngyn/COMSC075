
/*
Now write anther method sumDoubleList that takes in an arraylist of double values and return a double. 
Test using both an arrayList of double values and integer values. Make sure that the results are correct.
*/

import java.util.Scanner;
import java.util.ArrayList;

public class sumOfDoubleArrayList {
    
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
        System.out.println("Enter 3 numbers: ");
        ArrayList<Double> list = new ArrayList<Double>();
        for (int i = 0; i < 3; i++) {
			list.add(in.nextDouble());
		}
		
		System.out.println("Sum of list: " + sumList(list));
    }
    
    public static double sumList(ArrayList <Double> list) {
        double sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += list.get(i);
            }
        return sum;
    }
}

