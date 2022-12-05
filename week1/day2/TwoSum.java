package week1.day2;

public class TwoSum {
	
	/*
	 * int[] nums = {2, 5, 7, 11, 13, 15, 3, 8, 4};
	 * int target = 22;
	 * find out the numbers that reaches the target !!
	 * 
	 * Psuedo code: 
	 * 
	 * 1) loop through a number (outer loop)
	 * 2) loop through the next number (inner loop)
	 * 3) add both of them and compare with target
	 * 4) if it does not match, continue
	 * 5) if it matches, print and break
	 * 
	 */
	
	public static void main(String[] args) {
		int[] nums = {2, 5, 7, 11, 13, 15, 3, 8, 4};
		int target = 9;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				
				if(nums[i] + nums[j] == target) {
					System.out.println(nums[i]);
					System.out.println(nums[j]);
					break;
				}
			}
		}
		
		
	}

}
