package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnToHandleNestedFrame {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://leafground.com/frame.xhtml");
		
		//Get into the outer frame first
		driver.switchTo().frame(2); // 3rd iframe
		
		//get into the inner frame ; first iframe inside 3rd iframe
		driver.switchTo().frame(0);
			
		//Interact with WebElement inside the inner frame
		driver.findElement(By.id("Click")).click();
		
		
		
		//to get the control inside the immediate parent
		driver.switchTo().parentFrame();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
