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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnToLocateMultipleElements {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		List<WebElement> multipleElements = driver.findElements(By.className("inputLogin"));
		
		for (WebElement eachEle : multipleElements) {
			
			String attribute = eachEle.getAttribute("name");
			System.out.println(attribute);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
