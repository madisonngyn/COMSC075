
public class studentScores {
	
	public static String[] classRoster = {"Student A", "Student B", "Student C", "Student D", "Student E"}; 
	public static int exam3 = 2;
	
	public static void main (String[] args) {
		int[][] examScores = {{98, 88, 76, 56, 100}, 
				      {87, 67, 89, 100, 87}, 
				      {87, 98, 88, 99, 96}, 
				      {87, 88, 92, 87, 67}, 
				      {100, 100, 89, 87, 78}};
		
		// Using for loops, show me how you would find the highest score for exam 3. Which student got that score?
		int topScorer = 0;
		int highestScore = examScores[0][exam3];
		
		for (int i = 1; i < examScores.length; i++) {
			if (examScores[i][exam3] > highestScore) {
				highestScore = examScores[i][exam3];
				topScorer = i;
			}
		}
		System.out.println("The highest score for Exam 3 is " + highestScore + " and " + classRoster[topScorer] + " got this score.");
		
		// Using for loops, show me how you would calculate the average score for the 5 exams for each student? 
		int totalScore = 0;
		double averageScore;
		
		for (int i = 0; i < examScores.length; i++) {
			totalScore = 0;
			System.out.println();
			System.out.println(classRoster[i]);
			
			for (int a = 0; a < examScores[i].length; a++) {
				totalScore = totalScore + examScores[i][a];
			}
			
			averageScore = totalScore / 5;
			System.out.println("The average score is " + averageScore);
		}
	}
}

