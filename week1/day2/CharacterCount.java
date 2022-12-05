package week1.day2;

public class CharacterCount {
	
	public static void main(String[] args) {
		
		String company = "hexaware";
		char expected = 'e';
		
		// print how many time expected character present !!
		
		/*
		 * Psuedo
		 * 
		 * 1) Break into the characters
		 * 2) traverse to each character and compare with expected
		 * 3) if matches, count them 
		 * 4) else, continue !!
		 * 
		 */
		
		int count = 0;
		
		char[] charArray = company.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == 101) {
				count++;
				System.out.println(charArray[i]);
			}
		}
		System.out.println(count);

		
		
	}

}
