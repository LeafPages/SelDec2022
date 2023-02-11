package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	//to recieve ChromeDriver
	public LoginPage(ChromeDriver driver) {
		//global	 //local
		this.driver = driver;
		PageFactory.initElements(driver, this); //mandatory
	}
	

	
	@CacheLookup
	@FindBy(id="username") WebElement eleUsername;
	
	@CacheLookup
	@FindBy(id="password") WebElement elePassword;
	
	@CacheLookup
	@FindBy(className="decorativeSubmit") WebElement eleLogin;
	
	@CacheLookup
	@FindBy(xpath="//p[text()='The Following Errors Occurred:']") WebElement eleErrorMsg;
	
	
	//this keyword represents the object of the same page
				//action+ElementName
	public LoginPage enterUsername(String uName) throws InterruptedException, IOException {
		try {
			eleUsername.sendKeys(uName);
			reportStep("username is entered successfully","pass");
		} catch (Exception e) {
			reportStep("username is not entered successfully..."+e,"fail");
		}
		return this;
	}

	public LoginPage enterPassword(String pWord) throws IOException {
		try {
			elePassword.sendKeys(pWord);
			reportStep("password is entered successfully","pass");
		} catch (Exception e) {
			reportStep("password is not entered successfully..."+e,"fail");
		}
		return this;
	}

	public HomePage clickLoginButton() throws IOException {
		try {
			eleLogin.click();
			reportStep("Login button is clicked successfully","pass");
		} catch (Exception e) {
			reportStep("Login button is not clicked successfully..."+e,"fail");
		}
		return new HomePage(driver);
			
	}
	
	public LoginPage clickLoginButtonForNegativeData() {
		eleLogin.click();
		return this;
			
	}
	
	public void verifyErrorMessage() {
		boolean displayed = eleErrorMsg.isDisplayed();
		if(displayed) {
			System.out.println("Error is displayed");
		}else {
			System.out.println("Error is not displayed");
		}

	}
	
	
	
	
	
	
	

}
