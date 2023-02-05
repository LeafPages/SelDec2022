package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyLeadsPage extends BaseClass {

	public MyLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText(prop.getProperty("MyLeadsPage.CreateLead.LinkText"))).click();

		return new CreateLeadPage(driver);
	}

}
