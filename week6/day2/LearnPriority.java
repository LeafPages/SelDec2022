package week6.day2;

import org.testng.annotations.Test;
/*
 * priority -> DataType is int
 * 			-> default value is 0
 * 			-> accepts negative value as well * 
 * 
 */
public class LearnPriority {
	
	
	@Test(priority = -1)
	public void createLead() {
		System.out.println("Create Lead");

	}
	
	@Test //default priority as 0
	public void editLead() {
		System.out.println("Edit Lead");

	}
	
	@Test(priority = 3)
	public void deleteLead() {
		System.out.println("Delete Lead");

	}

}
