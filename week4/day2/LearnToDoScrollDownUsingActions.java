package week4.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnToDoScrollDownUsingActions {

	public static void main(String[] args) throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		WebElement uploadResume = driver.findElement(By.xpath("//button[text()='Upload Resume']"));	
		
		Actions builder = new Actions(driver);
		
		builder.scrollToElement(uploadResume).pause(Duration.ofSeconds(2)).click(uploadResume).perform();

	}

}
