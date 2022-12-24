package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnToHandleFrameUsingWebElement {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://leafground.com/frame.xhtml");
		
		//locate iframe as a WebElement
		WebElement firstFrame = driver.findElement(By.xpath("//h5[contains(text(),'Inside frame')]/following::iframe"));
		
		//Switch to frame using WebElement
		driver.switchTo().frame(firstFrame);
		
		driver.findElement(By.id("Click")).click();
		
		
		
		
	}

}
