package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	public ChromeDriver driver;
	
	@Given("Open the Chrome browser")
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Given("Load the application url {string}")
	public void loadApplication(String url) {
		driver.get(url);
	}
	
	
	@Given("Enter the username as {string}")
	public void enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	
	@Given("Enter the password as {string}")
	public void enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
	}
	
	@When("Click on login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	
	@Then("Homepage should be displayed")
	public void verifyHomePage() {
		String expTitle = "Leaftaps - TestLeaf Automation Platform";
		String actTitle = driver.getTitle();
		
		if(actTitle.equals(expTitle)) {
			System.out.println("Homepage is displayed");
		}else {
			System.out.println("Homepage is not displayed");
		}
	
		
	}
	
	@But("Error message should be displayed")
	public void verifyErrorMessage() {
		boolean displayed = driver.findElement(By.xpath("//p[contains(text(),'Password incorrect.')]")).isDisplayed();
		if(displayed) {
			System.out.println("Error message is displayed");
		}else {
			System.out.println("Error message is not displayed");
		}
		
		
	}
	
	/*
	 * @Given("Enter username as {string} and password as {string}") public void
	 * enterCredential(String uName, String pWord) {
	 * driver.findElement(By.id("username")).sendKeys(uName);
	 * driver.findElement(By.id("password")).sendKeys(pWord); }
	 */
	
}
