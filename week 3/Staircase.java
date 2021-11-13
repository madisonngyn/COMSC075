// Madison Nguyen
// September 16th, 2021
// This program is used the calculate the number of cubic centimeters of concrete needed to build a staircase by taking user input of the staircase's rise, run, and width.

import java.util.Scanner;

public class Staircase {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Staircase Volume Calculator");
		
		System.out.print("How many steps in the staircase? ");
		int numberOfSteps = in.nextInt();
		
		// calculating the number of blocks needed for the staircase
		int sumBlocks = (((numberOfSteps) * ((numberOfSteps) + 1)) / 2);
	
		System.out.print("Enter step width in cm: ");
		double stepWidth = in.nextDouble();
		
		System.out.print("Enter step rise in cm: ");
		double stepRise = in.nextDouble();
		
		System.out.print("Enter step run in cm: ");
		double stepRun = in.nextDouble();
		
		// calculating the volume of each block
		double volumeOfBlock = (stepWidth * stepRise * stepRun);
		
		// calclating the total volume of the blocks
		double totalVolumeOfBlocks = (sumBlocks * (stepWidth * stepRise * stepRun));
		int totalVolumeOfBlocksRounded = (int) (totalVolumeOfBlocks + 0.5);
		System.out.print("Total volume is " + totalVolumeOfBlocksRounded) + " cubic centimeters");
	}
}

