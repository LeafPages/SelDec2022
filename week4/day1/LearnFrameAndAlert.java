package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrameAndAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//switch to frame using index
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//switch to alert
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hari");
		alert.accept();
		
		String text = driver.findElement(By.id("demo")).getText();
		
		System.out.println(text);
		
		
		
		
		
		
		
		
		
	}

}
