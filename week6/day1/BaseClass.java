package week6.day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	 @BeforeClass
	  public void beforeClass() {
		  System.out.println("BeforeClass");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("AfterClass");
	  }


}
