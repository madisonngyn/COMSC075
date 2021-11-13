
public class abecedarianWords {
	
	public static boolean isAbecedarian(String s) {
		String f;
		String rest;
		
		if (s.length() < 2) {
			return true;
		}
		
		for (int i = 0; i < s.length()-1; i++) {
			f = s.charAt (i) + "";       // This gets the letter at i
			rest = s.substring(i+1);     // This gets the rest of the letters
			
			if (f.compareTo(rest) < 1) {
				return true;
			}
		}
		return false;
	}
}

