package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {
	
	/*
	 * List, Set --> Collection (Interface)
	 * Single Dimensional data collection 
	 * 
	 * When you like to store the data in 2 dimensional (key -> value pair) => Map !!
	 * Examples: Get character count or find the highest/lowest priced car name 
	 * 
	 * Map --> Interface 
	 * Can I create an object for the interface? No
	 * Then how can i use Map? through Implementation Classes
	 * Implementation: HashMap, TreeMap, LinkedHashMap
	 * HashMap --> faster (uses Hashing Algorithm) 
	 * TreeMap --> Key ASCII Order 
	 * LinkedHashMap --> Insertion Order of Key !!
	 * 
	 * (Key, Value) --> Pair  --> Entry !
	 * Key --> No Duplicates allowed (Set)
	 * Value --> Yes, Duplicates allowed 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Map<Integer,String> mentors = new HashMap<Integer,String>();
		mentors.put(20201920, "Ram"); // equivalent of add in List, Set
		mentors.put(20201921, "Princilla");
		mentors.put(20201922, "Aravind");
		mentors.put(20201923, "Subraja");
		mentors.put(20201924, "Dhilip");
		mentors.put(20201925, "Easwar");
		mentors.put(20201926, "Ranjani");
		mentors.put(20201927, "Aravind");
		mentors.put(20201922, "Babu"); // When you like to update the map, use the same key with different value.

		System.out.println(mentors.size());
		
		
		// do I have method called get --> to access index of the Set?
		// Hence we are going to use foreach !! 
		
		Set<Entry<Integer, String>> entrySet = mentors.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey());
		}
		
		
		
		
		
		
		
		
		
		
	}

}













