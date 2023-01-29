package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead_StepDefinition extends BaseClass{
	
	
	@When("Click on {string} link")
	public void clickLink(String text) {
		driver.findElement(By.linkText(text)).click();

	}
	
	@Then("{string} Page should be displayed")
	public void verifyPage(String pageName) {
		boolean displayed = driver.findElement(By.xpath("//div[text()='"+pageName+"']")).isDisplayed();
		if(displayed) {
			System.out.println(pageName+" Page is displayed");
		}else {
			System.out.println(pageName+" Page is not displayed");
		}

	}
	
	
	
	
	/*
	 * @Given("Enter username as {string} and password as {string}") public void
	 * enterCredential(String uName, String pWord) {
	 * driver.findElement(By.id("username")).sendKeys(uName);
	 * driver.findElement(By.id("password")).sendKeys(pWord); }
	 */
	
}
