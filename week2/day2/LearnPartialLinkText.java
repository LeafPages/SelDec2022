package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPartialLinkText {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		//driver.findElement(By.linkText("Forgot Your Password?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		
		
		
		
		

	}

}
