package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceLogin {

	public static void main(String[] args) {
		//Create object for ChromeDriver -> Will download the chromedriver.exe
		//setup the path of the chromedriver.exe
		//Will open the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//to maximize the window size
		driver.manage().window().maximize();
		
		
		/*
		 * Options manage = driver.manage(); Window window = manage.window();
		 * window.maximize();
		 */
		
		
		//to load the application
		driver.get("https://login.salesforce.com/");
		
			
		//WebElement eleUsername = driver.findElement(By.id("username"));
		//eleUsername.sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		
		
		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("Testleaf$321");
		
		WebElement eleLogin = driver.findElement(By.id("Login"));
		eleLogin.click();
		
		//to close the current window
		driver.close();
		
		//to close all the windows / tabs opened by selenium webdriver
		//driver.quit();
		

	}

}
