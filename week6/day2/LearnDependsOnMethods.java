package week6.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

/*
 * dependsOnMethods -> DataType is String[]
 * 		   -> default value is {}
 *         -> packageName.ClassName.methodName
 * 			 
 */
public class LearnDependsOnMethods {
	
	@Test
	public void createLead() {
		System.out.println("Create Lead");
		throw new NoSuchElementException();

	}
	
	@Test(dependsOnMethods = "createLead", priority = 1)
	public void editLead() {
		System.out.println("Edit Lead");

	}
	
	@Test(dependsOnMethods = {"createLead","editLead"})
	public void deleteLead() {
		System.out.println("Delete Lead");

	}

}
