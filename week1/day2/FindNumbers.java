package week1.day2;

public class FindNumbers {
	
	public static void main(String[] args) {
		
		String data = new String("testleaf");
		
		String details = "Amazon has 11400 employees in chennai";
		
		/*
		// print the numbers only from here!!
		char[] charArray = details.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] >= 48 && charArray[i] <= 57 ) {
				System.out.println(charArray[i]);
			}
		}
		*/
		
		String number = details.replaceAll("[^0-9]", "");
		System.out.println(number);
		
		// charAt(i), indexOf('c')
		
	}

}
