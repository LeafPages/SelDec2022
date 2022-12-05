package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		
		int n = 7;
		boolean bPrime = true;
		
		//  Iterate through all numbers from 2 to n-1 (input) and 
		for (int i = 2; i < n; i++) {
			
			// for every number check if it divides n (input).
			if(n % i == 0) {
				System.out.println("not a prime");
				bPrime = false;
				break;
			} 
			
		}
		
		if(bPrime) {
			System.out.println("It is prime");
		}

	}

}
