package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class VerifyLogin extends BaseClass{
	
	@BeforeTest
	public void setValue() {
		excelFileName = "Login";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String uName, String pWord) throws InterruptedException {
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
