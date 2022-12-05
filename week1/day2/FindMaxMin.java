package week1.day2;

import java.util.Arrays;

public class FindMaxMin {

	public static void main(String[] args) {

		int[] nums = {22, 5, 1, 67, 28, 182, 6};
		
		// Find the min -> 1, max -> 182
		
		System.out.println(nums.length);
		
		// {1, 5, 6, 22, 28, 67, 182} --> sort
		Arrays.sort(nums); // You should know the built in methods !!
		System.out.println(nums[0]);
		System.out.println(nums[nums.length-1]);

		
	}

}
