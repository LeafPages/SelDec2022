package week1.day2;

public class LearnString {
	
	// String --> What ?? Is a class --> collection of characters !!
	
	public static void main(String[] args) {
		
		/*
		 * 1) Literal 
		 * 2) Object (Instant)
		 * 
		 */
		
		String name = "Testleaf";
		
		// M1 = How do we the number of characters in the String?
		int length = name.length();
		System.out.println(length);
		
		// M2 = Can I convert String to Character?
		char[] charArray = name.toCharArray();
		System.out.println(charArray[0]);
		
		// print every character and check whether 'L' is present or not !!
		for (int i = 0; i < charArray.length; i++) {
			//System.out.println(charArray[i]);
			if(charArray[i] == 'L') {
				System.out.println("Present");
			}
		}
		
		// M3 = How to check a character(s) exist or not?
		if(name.contains("L") || name.contains("l")) {
			System.out.println("Present");
		} else {
			System.out.println("Not Present");
		}
	}

}












