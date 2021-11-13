import java.util.Scanner;

public class studentGrade {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Name of student: Enter 0 to quit ");
		String studentName = in.nextLine();
       
		while (!studentName.equals("0")) {
			
			System.out.print("Total score for homework (out of 50): ");
			double homeworkScore = in.nextDouble();
       
			System.out.print("Total score for midterm (out of 200): ");
			double midtermScore = in.nextDouble();
       
			System.out.print("Total score for lab (out of 100): ");
			double labScore = in.nextDouble();
       
			System.out.print("Total score for final (out of 150): ");
			double finalScore = in.nextDouble();
       
			double classScore = (homeworkScore + midtermScore + labScore + finalScore);
			System.out.println("Total score for the class (out of 500): " + classScore);
       
			if (classScore >= 450) {
				System.out.println(studentName + " has an A in the class.");
			}
			else if (classScore >= 400) {
				System.out.println(studentName + " has a B in the class.");
			}
			else if (classScore >= 350) {
				System.out.println(studentName + " has a C in the class.");
			}
			else if (classScore >= 300) {
				System.out.println(studentName + " has a D in the class.");
			}
			else {
				System.out.println(studentName + " has an F in the class.");
			}
			
			System.out.print("Name of student: Enter 0 to quit ");
			studentName = in.next();
		}
	}
}
