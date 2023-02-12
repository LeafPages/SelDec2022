package week9.day1;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		int[] inputs = { 10, 20, 30 }; // indices are 0,1,2

		try {
			System.out.println(x / y);
			System.out.println(inputs[3]);

		} catch (ArithmeticException e) { // can catch only ArithmeticException
			// take default value for y as 1
			System.out.println(x / 1);
		} catch (ArrayIndexOutOfBoundsException e) { // can catch only ArrayIndexOutOfBoundsException
			System.out.println(e);
		}catch (Exception e) { // can catch any exception
			System.out.println(e);
		} 

		System.out.println("End of Program");

	}

}
