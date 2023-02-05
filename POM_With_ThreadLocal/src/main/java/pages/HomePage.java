package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class HomePage extends BaseClass {

	

	@Then("HomePage should be displayed")
	public HomePage verifyHomePage() {
		boolean displayed = getDriver().findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (displayed) {
			System.out.println("HomePage is displayed");
		} else {
			System.out.println("HomePage is not displayed");
		}

		return this;
	}

	public LoginPage clickLogoutButton() {
		getDriver().findElement(By.className("decorativeSubmit")).click();

		return new LoginPage();
	}

	public MyHomePage clickCRMSFA() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();

		return new MyHomePage();
	}

}
