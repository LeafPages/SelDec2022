package week9.day1;

import org.apache.poi.openxml4j.util.ZipArchiveThresholdInputStream;

public class LearnThrow {
	
	public static int divide(int num1, int num2) {
		int res = 0;
		if(num1 > num2) {
			res = num1 / num2;
		}else {
			throw new ArithmeticException("Input1 is smaller than input2");
		}
		
		return res;

	}

	public static void main(String[] args) {
		int result = divide(10,20);
		System.out.println(result);

	}

}
