package week1.day2;

import java.util.Arrays;

public class FindDuplicates {
	
	public static void main(String[] args) {
		
		int[] nums = {2, 5, 7, 7, 5, 9, 2, 3};

		/*
		 * Psuedo code: 
		 * 
		 * 1) loop through a number (outer loop)
		 * 2) loop through the next number (inner loop)
		 * 3) compare both
		 * 4) if it does not match, continue
		 * 5) if it matches, print and break
		 */
		
		/*
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i] == nums[j]) {
					System.out.println("Duplicate "+nums[i]);
				}
			}
		} */
		
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i] == nums[i+1]) {
				System.out.println("Duplicate "+nums[i]);
			}
		}
		
		
	}

}
