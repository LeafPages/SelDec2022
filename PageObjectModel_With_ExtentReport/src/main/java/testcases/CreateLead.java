package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateLead extends BaseClass{
	
	
	@BeforeTest
	public void setValue() {
		excelFileName = "CreateLead";
		testName = "Create Lead";
		testDescription = "Create Lead with mandatory information";
		testCategory = "function";
		testAuthor ="Hari";
	}
	
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String uName, String pWord, String fName, String lName, String cName) throws InterruptedException, IOException {
		System.out.println(driver);
		new LoginPage(driver)
		.enterUsername(uName)  //from excel
		.enterPassword(pWord)  //from excel
		.clickLoginButton();
		/*.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterFirstName(fName) //from excel
		.enterLastName(lName)  //from excel
		.enterCompanyName(cName) //from excel
		.clickCreateLeadButton()
		.verifyFirstName();*/
		

	}

}
