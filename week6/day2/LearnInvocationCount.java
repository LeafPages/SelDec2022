package week6.day2;

import org.testng.annotations.Test;
/*
 * invocationCount -> is an attribute for @Test
	DataType: int
	default value: 1
 * 
 * 
 */
public class LearnInvocationCount {
		
	@Test(threadPoolSize = 3, invocationCount = 100)
	public void createLead() {
		System.out.println("Create Lead");

	}

}
