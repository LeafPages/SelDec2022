package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BuyTheValue {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://buythevalue.in/");
		driver.findElement(By.partialLinkText("URBAN FIT X SMART WATCH")).click();
		
		WebElement eleFrame = driver.findElement(By.xpath("//iframe[@title='chat widget']"));
		driver.switchTo().frame(eleFrame);
		driver.findElement(By.xpath("//button[@aria-label='Dismiss']")).click();
		driver.switchTo().defaultContent();
		
		WebElement eleZipcode = driver.findElement(By.id("wk_zipcode"));
		eleZipcode.sendKeys("600128");
		eleZipcode.sendKeys(Keys.TAB,Keys.ENTER);
		
		driver.findElement(By.id("product-add-to-cart")).click();
		driver.findElement(By.xpath("(//a[text()='View Cart'])[2]")).click();
		
		driver.findElement(By.id("checkout")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("agree")).click();
		
		
	}

}
