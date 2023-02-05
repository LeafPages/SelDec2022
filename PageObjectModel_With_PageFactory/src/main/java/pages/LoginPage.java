package pages;

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
	
	
//	@FindBy(how = How.ID, using="username")	WebElement eleUsername;
	
	//AND Condition
	/*
	 * @FindBys( {
	 * 
	 * @FindBy(name="USERNAME123"),
	 * 
	 * @FindBy(xpath="//input[@id='username']")
	 * 
	 * } ) WebElement eleUsername;
	 */
	
	//OR condition
	/*
	 * @FindAll( {
	 * 
	 * @FindBy(name="USERNAME123"),
	 * 
	 * @FindBy(xpath="//input[@id='username']")
	 * 
	 * } ) WebElement eleUsername;
	 */
	
	
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
	public LoginPage enterUsername(String uName) throws InterruptedException {
		eleUsername.sendKeys(uName);
		return this;
	}

	public LoginPage enterPassword(String pWord) {
		elePassword.sendKeys(pWord);
		return this;
	}

	public HomePage clickLoginButton() {
		eleLogin.click();
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
