package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnToHandleAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			
		driver.get("https://leafground.com/alert.xhtml");
				
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//Step1: Switch the control to the alert
		Alert alert = driver.switchTo().alert();
		
		//to read the alert message
		String alertMsg = alert.getText();
		System.out.println(alertMsg);
		
		//Step2: to accept the alert
		alert.accept();
		
		//Confirm alert
		driver.findElement(By.xpath("//h5[contains(text(),'Confirm Dialog')]/following::span[text()='Show']")).click();
		
		driver.switchTo().alert().dismiss();
		
		//Prompt Alert
		driver.findElement(By.xpath("//h5[contains(text(),'Prompt Dialog')]/following::span[text()='Show']")).click();
		
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("Hari");
		alert2.accept();
		
		
		//handling Sweet Alert
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
