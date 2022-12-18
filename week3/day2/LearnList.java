package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		
		List<String> mentors = new ArrayList<String>();
		mentors.add("Ram");
		mentors.add("Princilla");
		mentors.add("Aravind");
		mentors.add("Subraja");
		mentors.add("Dhilip");
		mentors.add("Ranjani");
		mentors.add("Easwar");
		
		System.out.println(mentors.size());
		
		mentors.remove(2); // aravind 
		System.out.println(mentors.size());
		
		mentors.add("Ram"); // Duplicate??
		System.out.println(mentors.size());
		
		for (int i = 0; i < mentors.size(); i++) {
			System.out.println(mentors.get(i));
		}
		
		System.out.println(mentors.contains("Subraja"));
		//mentors.clear();
		//System.out.println(mentors.size());
		
		
		Object[] array = mentors.toArray();
		System.out.println(array.length);
		//System.out.println(array[0]);
		System.out.println(mentors);
		
		
		Arrays.sort(array);
		System.out.println(array.toString());
		
		Collections.sort(mentors); // In memory sorting
		System.out.println(mentors);
		
		
		
		
		

	}

}
