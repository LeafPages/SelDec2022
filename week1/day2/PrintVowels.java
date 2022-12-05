package week1.day2;

public class PrintVowels {
	
	public static void main(String[] args) {
		
		String name = "google";
		
		// I need to print only the vowels - a, e, i, o, u !
		
		/*
		 * 1) Break the word into the character
		 * 2) check if the character is any of the vowel 
		 * 3) if it is -> print that 
		 * 4) else continue !!
		 */
		
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == 'a'|| charArray[i] == 'e' 
					|| charArray[i] == 'i' 
					|| charArray[i] == 'o' 
					|| charArray[i] == 'u' ) {
				System.out.println(charArray[i]);
			}
		}
		
	}

}
