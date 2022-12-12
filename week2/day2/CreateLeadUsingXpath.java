package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadUsingXpath {

	public static void main(String[] args) {

		// to open Edge browser
		// EdgeDriver driver = new EdgeDriver();

		// To open a browser(chrome)
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//to application url
		driver.get("http://leaftaps.com/opentaps");
		
		
		//to locate a WebElement
		WebElement eleUser = driver.findElement(By.xpath("//input[@id='username']")); //input[@id='username']
		eleUser.sendKeys("DemoSalesManager");
		
		//Step1: locate the element
		WebElement elePassword = driver.findElement(By.name("PASSWORD"));
		elePassword.sendKeys("crmsfa");
		
		
		WebElement eleLogin = driver.findElement(By.className("decorativeSubmit"));
		eleLogin.click();
		
		
		//to click on hyper link
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click(); // partial textbased xpath //a[contains(text(),'CRM')]
		

	}

}
