package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnToComeoutOfTheFrame {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://leafground.com/frame.xhtml");
		
		//index for frames -> starts with 0 (4 frames -> 0,1,2,3)
		
		//Switch to frame using index
		driver.switchTo().frame(0);
				
		//interact with WebElement inside the frame
		driver.findElement(By.id("Click")).click();
		
		
		//want to access the element in the main html / page / DOM
		
		//Step1: Come out of the frame
		driver.switchTo().defaultContent();
		
		String text = driver.findElement(By.xpath("//h5[contains(text(),'Click Me')]")).getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
