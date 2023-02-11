package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class VerifyLogin extends BaseClass{
	
	@BeforeTest
	public void setValue() {
		excelFileName = "Login";
		testName = "Verify Login";
		testDescription = "Verify login with valid data";
		testCategory = "smoke";
		testAuthor ="Hari";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String uName, String pWord) throws InterruptedException, IOException {
		System.out.println(driver);
		
		//first action is enterUsername which is available in LoginPage
		//Create Object for LoginPage
		
	//	LoginPage lp = new LoginPage();
		
		new LoginPage(driver)
		.enterUsername(uName)
		.enterPassword(pWord)
		.clickLoginButton()
		.verifyHomePage();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
