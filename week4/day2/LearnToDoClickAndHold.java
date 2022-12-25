package week4.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnToDoClickAndHold {

	public static void main(String[] args) throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/selectable/");
		
		//switch to the frame
		driver.switchTo().frame(0);

		// locate the source element
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
		
		
		// Step1 : Create object for Actions class
		Actions builder = new Actions(driver);

		// step2: use appropriate method to do the action
		builder
		.clickAndHold(item1)
		.moveToElement(item7)
		.release()
		.perform();// perform() is mandatory at the end of actions
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
