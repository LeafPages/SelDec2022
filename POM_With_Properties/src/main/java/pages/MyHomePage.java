package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyHomePage extends BaseClass{
	
	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public MyLeadsPage clickLeads() {
		driver.findElement(By.linkText(prop.getProperty("MyHomePage.Leads.LinkText"))).click();
		
		return new MyLeadsPage(driver);
	}

}
