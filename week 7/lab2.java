public class lab2 {
	public static boolean areFactors(int n, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%n != 0) {
				return false;
			}
		}
		return true; 
	}
}
