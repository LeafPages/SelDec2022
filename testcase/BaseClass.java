package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	public ChromeDriver driver;
	/*
	 * order of the parameter can be anything
	 * parameter name should be exactly matching with name in the testng.xml
	 * 
	 * Argument name could be meaningful name
	 * Order of argument should be same as defined in the @Parameters
	 */
	@Parameters({"url","username","password"}) 
	@BeforeMethod
	public void preCondition(String url, String uName, String pWord) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pWord);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();

	}

}
