package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnMultiSelect {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.uitestpractice.com/Students/Select");
		
		WebElement eleMulti = driver.findElement(By.id("countriesMultiple"));
		Select dd = new Select(eleMulti);
		dd.selectByVisibleText("England");
		dd.selectByVisibleText("India");
		
		
		//To deSelect a value from dropdown
		dd.deselectByVisibleText("England");
		
		
		
		
		

	}

}
