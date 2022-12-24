package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnToTakeScreeshotOfWebElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		WebElement eleUsername = driver.findElement(By.xpath("//label[text()='Username']"));
				
		//step1: take the screenshot
		File source = eleUsername.getScreenshotAs(OutputType.FILE);
		
		//Step2: decide / define the target file
		File target = new File("./snaps/username.png");
		
		//step3: save the source to target
		FileUtils.copyFile(source, target);
		
			
		
		

	}

}
