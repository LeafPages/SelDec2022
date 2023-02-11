package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class HomePage extends BaseClass {

	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	public HomePage verifyHomePage() throws IOException {
		try {
			boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
			if (displayed) {
				System.out.println("HomePage is displayed");
			} else {
				System.out.println("HomePage is not displayed");
			}
			reportStep("Login is verified", "pass");
		} catch (Exception e) {
			reportStep("Login is not verified", "fail");
		}

		return this;
	}

	public LoginPage clickLogoutButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

		return new LoginPage(driver);
	}

	public MyHomePage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();

		return new MyHomePage(driver);
	}

}
