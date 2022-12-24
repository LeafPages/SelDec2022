package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		//implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");

		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("Testleaf$321");

		WebElement eleLogin = driver.findElement(By.id("Login"));
		eleLogin.click();
		
	
		//Thread.sleep(10000); //10 sec
		driver.findElement(By.className("slds-icon-waffle")).click(); //not loading immediately (0 sec)
		
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		
		
		
		
		
		
		
		

	}

}
