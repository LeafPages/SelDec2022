package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTC_WindowHandling {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/");
		
		driver.findElement(By.partialLinkText("FLIGHTS")).click();
		
		//step1: get all the window handles
		Set<String> windowHandles = driver.getWindowHandles();
		
		//Step2: Copy Set to List
		List<String> listOfHandles = new ArrayList<String>(windowHandles);
		
		//Step3: to switch to the 2nd window
		driver.switchTo().window(listOfHandles.get(1));
		
		
		//Steps to take the screenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/flights.png");
		FileUtils.copyFile(source, target);
		
		//to close the 2nd window
		driver.close();
		
		//to go back to the first window
		driver.switchTo().window(listOfHandles.get(0));
		
		//print the first window title
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
