package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnToHandleMultipleWindows {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/window.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//print the title current window
		System.out.println(driver.getTitle());
		
		//to get the current window handle
		String firstWindow = driver.getWindowHandle();
		System.out.println(firstWindow);
		System.out.println("****************************************");
		
		//To get all the references of all the opened windows
		Set<String> allWindowHandles = driver.getWindowHandles(); //unique handles; it maintains the order LinkedHashSet
		
		for (String eachHandle : allWindowHandles) {
			System.out.println(eachHandle);
			
		}
		
		System.out.println("*******************************************");
		//copy the Set into List
		List<String> listOfHandles = new ArrayList<String>(allWindowHandles);
		
		String secondWindow = listOfHandles.get(1);
		
		System.out.println(secondWindow);
		
		//to switch the control to the second window
		
		driver.switchTo().window(secondWindow);
		
		System.out.println(driver.getTitle());
		
		driver.close(); // to close the current window (2nd window)
		
		driver.switchTo().window(listOfHandles.get(0));
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
