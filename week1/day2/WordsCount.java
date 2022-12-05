package week1.day2;

public class WordsCount {
	
	public static void main(String[] args) {
		
		String name = "Amazon development center, Chennai";
		
		// Reverse the words only with lower case!! --> chennai center, development amazon 
		
		// lower case !!
		String lowerCase = name.toLowerCase();
		
		// split into words 
		String[] words = lowerCase.split(" ");
		
		for (int i = words.length-1; i >= 0 ; i--) {
			System.out.print(words[i]+" ");
		}
		
	}

}
