package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
	
	public static void main(String[] args) {
		
		int[] numbers = {2,3,5,2,3,6,7,8,3,8,8,9,11};
		// Duplicate values --> 2,3,8
		
		Set<Integer> unique = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();

		for (int i = 0; i < numbers.length; i++) {
			if(!unique.add(numbers[i])) {
				duplicates.add(numbers[i]);
			}
		}
		
		System.out.println(unique);
		System.out.println(duplicates);
		
		
	}

}
