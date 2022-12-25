package week4.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnToDoDragAndDrop {

	public static void main(String[] args) throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/drag.xhtml");

		// locate the source element
		WebElement sourceElement = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		// locate the target element
		WebElement targetElement = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		// Step1 : Create object for Actions class
		Actions builder = new Actions(driver);

		// step2: use appropriate method to do the action
		builder.dragAndDrop(sourceElement, targetElement).perform(); // perform() is mandatory at the end of actions
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
