package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class VerifyLoginForNegativeCredential extends BaseClass{
	
	@BeforeTest
	public void setValue() {
		excelFileName = "LoginForNegative";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String uName, String pWord) throws InterruptedException, IOException {
				
		new LoginPage(driver)
		.enterUsername(uName)
		.enterPassword(pWord)
		.clickLoginButtonForNegativeData()
		.verifyErrorMessage();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
