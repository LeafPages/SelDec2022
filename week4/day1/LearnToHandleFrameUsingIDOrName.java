package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnToHandleFrameUsingIDOrName {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://dev110326.service-now.com/");
		//implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Switch to frame using id / name
		driver.switchTo().frame("gsft_main123");
		
				
		//interact with WebElement inside the frame
		driver.findElement(By.id("user_name")).sendKeys("admin");
		
	}

}
