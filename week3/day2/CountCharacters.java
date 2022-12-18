package week3.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountCharacters {

	public static void main(String[] args) {
		
		String company = "amazon development center"; 
			
		char[] charArray = company.toCharArray();
		
		// Use What? List / Set / Map ?
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		
		// Loop through every character
		for (int i = 0; i < charArray.length; i++) {
			
			// Before adding to the map --> I should check if the character already exist or not?
			if(map.containsKey(charArray[i])) {
				// If it already exist, update the character (key) with value as existing value + 1
				Integer existingCount = map.get(charArray[i]);
				map.put(charArray[i], existingCount+1);
			} else {
				// If it does not exist, add the character (key) to the map with 1 as value !!
				map.put(charArray[i], 1);
			}
			
		}
		System.out.println(map);
		
	}
}
