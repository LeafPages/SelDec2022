package week1.day1;

public class OddNumber {
	
	public static void main(String[] args) {
		
		// 1 -> 20 --> print odd !!
		// number % 2 --> 0 (even) and not zero (odd) 
		
		
		for (int i = 1; i <= 20; i++) {
			if(i%2 == 1) {
				//System.out.println("Odd number "+i);
			}
			else  {
				System.out.println("Even number "+i);
			}

		}
		
	}

}
