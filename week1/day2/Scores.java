package week1.day2;

public class Scores {
	
	// Arrays will have definite size !!
	// Exception : ArrayIndexOutOfBoundsException
	
	public static void main(String[] args) {
		
		String[] subjects = {"English", "Tamil", "Maths", "Science", "Social Science"};
		int tenthMarks[] = {99, 91, 87, 99, 87};
		
		// array length (property) --> count of array items
		for (int i = 0; i < tenthMarks.length; i++) {
			System.out.print(subjects[i]+" : ");
			System.out.println(tenthMarks[i]);
		}
		
		int[] marks = new int[5];
		marks[0] = 99;
		marks[1] = 91;
		marks[2] = 87;
		marks[3] = 99;
		marks[4] = 87;
		System.out.println(marks[0]);
		
		String[] mentors = new String[4];
		System.out.println(mentors[0]);

		
	}

}
