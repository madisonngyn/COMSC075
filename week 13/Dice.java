
import java.util.Scanner;
import java.util.Random;

public class Dice {
	
	public static int getNRolls(Scanner input) {
		int rolls = 0;
		do {
			System.out.println("How many times would you like to roll the dice? Choose a number between 1 and 999.");	
			rolls = input.nextInt();
			if (rolls < 1 || rolls > 999) {
				System.out.println("Error. Please enter a number between 1 and 999.");
			}
		} while (rolls < 1 || rolls > 999);
			return rolls;
	}
	
	public static int[][] rollDice (int nRolls) {
		int[][] rolls = new int[6][6];
		Random random = new Random();
		for (int i = 0; i < nRolls; i++) {
            int dice1 = random.nextInt(6);
            int dice2 = random.nextInt(6);
            rolls[dice1][dice2] = rolls[dice1][dice2] + 1;
        }
        return rolls;
   }

public static void printRolls(int[][] rolls) {
        int[] diceSides = {1, 2, 3, 4, 5, 6};
        System.out.print("\n");
        System.out.println("Frequencies for individual dice");
        System.out.print("   ");
        for (int i = 0; i < diceSides.length; i++) {
            System.out.printf("%4d ",diceSides[i]);
        }
        System.out.print("\n   ------------------------------");
        System.out.print("\n");
        for (int rows = 0; rows < 6; rows++) {
            System.out.print(diceSides[rows] + "| ");
            for (int column = 0; column < 6; column++) {
                System.out.printf("%4d ", rolls[rows][column]);
            }
            System.out.println();
        }
    }

	public static int[] calcFrequencies(int[][] rolls) { 
		int totals[] = new int[11];
		for (int rows = 0; rows < 6; rows++) {
			for (int column = 0; column < 6; column++) {
				totals[rows + column] = totals[rows + column] + rolls[rows][column];
			}
		}
		return totals;
	}
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		int nRolls = getNRolls(input);
		int[][] rolls = rollDice(nRolls);
		printRolls(rolls);
		int totals[] = calcFrequencies(rolls);
		System.out.print("\n");
		System.out.println("Frequencies of totals");
		for (int i = 0; i < totals.length; i++) {
			System.out.print((i + 2) + "| ");
            System.out.print(totals[i]);
            System.out.print("\n");
        }
   }
}

