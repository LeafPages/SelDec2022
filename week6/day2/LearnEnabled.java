package week6.day2;

import org.testng.annotations.Test;

/*
 * enabled -> DataType is boolean
 * 		   -> default value is true
 * 			 
 */
public class LearnEnabled {
	
	@Test
	public void createLead() {
		System.out.println("Create Lead");

	}
	
	@Test(enabled = false)
	public void editLead() {
		System.out.println("Edit Lead");

	}
	
	@Test
	public void deleteLead() {
		System.out.println("Delete Lead");

	}

}
