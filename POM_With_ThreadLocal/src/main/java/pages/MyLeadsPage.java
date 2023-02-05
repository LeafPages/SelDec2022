package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyLeadsPage extends BaseClass {

	

	public CreateLeadPage clickCreateLead() {
		getDriver().findElement(By.linkText("Create Lead")).click();

		return new CreateLeadPage();
	}

}
