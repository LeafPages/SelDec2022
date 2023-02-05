package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {
	
	
		
	//this keyword represents the object of the same page
				//action+ElementName
	@Given("Enter the username as {string}")
	public LoginPage enterUsername(String uName) throws InterruptedException {
		//System.out.println(driver);
		getDriver().findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
		//Thread.sleep(10000);
		return this;
	}

	@Given("Enter the password as {string}")
	public LoginPage enterPassword(String pWord) {
		getDriver().findElement(By.id("password")).sendKeys(pWord);
		
		return this;
	}

	@When("Click on Login button")
	public HomePage clickLoginButton() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
				
		return new HomePage();
		
		
	}

}
