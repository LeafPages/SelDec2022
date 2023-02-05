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
		
		
		new LoginPage()
		.enterUsername(uName)
		.enterPassword(pWord)
		.clickLoginButton()
		.verifyHomePage();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
