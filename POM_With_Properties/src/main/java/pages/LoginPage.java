package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	//to recieve ChromeDriver
	public LoginPage(ChromeDriver driver) {
		//global	 //local
		this.driver = driver;
	}
	
	
	//this keyword represents the object of the same page
				//action+ElementName
	public LoginPage enterUsername(String uName) throws InterruptedException {
		System.out.println(driver);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(prop.getProperty("username"));
		//Thread.sleep(10000);
		return this;
	}

	public LoginPage enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		
		return this;
	}

	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
				
		return new HomePage(driver);
		
		
	}

}
