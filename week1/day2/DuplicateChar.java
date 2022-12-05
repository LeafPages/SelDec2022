package week1.day2;

public class DuplicateChar {

	public static void main(String[] args) {
		
		String company = "amazon development";
		
		// convert String to char array
		char[] charArray = company.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i+1; j < charArray.length; j++) {
				if(charArray[i] == charArray[j]) {
					System.out.println("Duplicate :"+charArray[i]);
				}
			}
		}

	}

}
