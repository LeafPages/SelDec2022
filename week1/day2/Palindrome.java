package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String name = "Madam"; // madam
		
		// break into characters
		// loop from the end to go to the first
		
		// convert the string to lowercase
		//name = name.toLowerCase();
		
		// print !
		
		char[] charArray = name.toCharArray();
		String reverseString = "";
		
		for (int i = charArray.length-1; i >= 0; i--) {
			//System.out.print(charArray[i]);
			reverseString = reverseString + charArray[i];
		}
		System.out.println(reverseString);
		
		// Both the initial and reverse are same
		if(name.equalsIgnoreCase(reverseString)) { // comparing the memory address
			System.out.println("They are palindrome");
		} else {
			System.out.println("They are not palindrome");
		}

	}

}
