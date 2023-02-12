package week9.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebDriverWait {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/waits.xhtml;jsessionid=node01ieute8blv7ii1vs6kjf4ue2uy98704.node0");
		
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='Click Second']"))));
		
		
		String text = driver.findElement(By.xpath("//span[text()='Click Second']")).getText();
		System.out.println(text);

	}

}
