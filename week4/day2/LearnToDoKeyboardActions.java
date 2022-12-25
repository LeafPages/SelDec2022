package week4.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnToDoKeyboardActions {

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
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		
		
		// Step1 : Create object for Actions class
		Actions builder = new Actions(driver);

		// step2: use appropriate method to do the action
		builder
		.keyDown(Keys.CONTROL)
		.click(item5)
		.click(item3)
		.click(item1)
		.keyUp(Keys.CONTROL)
		.perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
