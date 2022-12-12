package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnToHandleDropDown {

	public static void main(String[] args) {

		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		
		
		//to locate a WebElement
		WebElement eleUser = driver.findElement(By.id("username"));
		
		//to type a value in a text field
		eleUser.sendKeys("DemoSalesManager");
		
		//Step1: locate the element
		WebElement elePassword = driver.findElement(By.name("PASSWORD"));
		
		//Step2: to interact with the WebElement
		elePassword.sendKeys("crmsfa");
		
		
		WebElement eleLogin = driver.findElement(By.className("decorativeSubmit"));
		
		//to click on a WebElement
		eleLogin.click();
		
		
		//to click on hyper link
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//3 Step process to select value from dropdown
		
		//Step1: Locate the parent element which is having <select>
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//Step2: Create object for Select class and pass the Parent WebElement
		Select dropDown1 = new Select(eleSource);
		
		//Step3: Select the value using the visible text
		dropDown1.selectByVisibleText("Conference");
		
		
		//Select using value
		WebElement eleIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropDown2 = new Select(eleIndustry);
		dropDown2.selectByValue("IND_FINANCE");
		
		//select using index -> Index always starts with 0
		WebElement eleOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropDown3 = new Select(eleOwnership);
		dropDown3.selectByIndex(3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
