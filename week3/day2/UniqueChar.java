package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueChar {
	
	public static void main(String[] args) {
		
		String companyName = "google" ;
		
		char[] charArray = companyName.toCharArray();
		Set<Character> unqiue = new LinkedHashSet<Character>();
		String output = "";
		
		for (int i = 0; i < charArray.length; i++) {
			if(unqiue.add(charArray[i])) {
				output = output+charArray[i];
			}
		}
		
		System.out.println(output);
	}

}
