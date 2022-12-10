package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) {

		// to open Edge browser
		// EdgeDriver driver = new EdgeDriver();

		// To open a browser(chrome)
		ChromeDriver driver = new ChromeDriver();
		
		//to application url
		driver.get("http://leaftaps.com/opentaps");
		
		
		//to locate a WebElement
		WebElement eleUser = driver.findElement(By.id("username"));
		
		//to type a value in a text field
		eleUser.sendKeys("DemoSalesManager");
		
		//Step1: locate the element
		WebElement elePassword = driver.findElement(By.name("PASSWORD"));
		
		//Step2: to interact with the WebElement
		elePassword.sendKeys("crmsfa");
		
		
		WebElement eleLogin = driver.findElement(By.className("decorativeSubmit"));
		
		//to click on a WebElement
		eleLogin.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
