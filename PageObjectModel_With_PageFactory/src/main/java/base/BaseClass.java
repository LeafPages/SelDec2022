package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcelData;

public class BaseClass {

	public ChromeDriver driver;

	public String excelFileName; // initial value is null

	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		return ReadExcelData.readData(excelFileName);

	}

	@BeforeMethod
	public void preCondition() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps");
	}

	@AfterMethod
	public void postCondition() {
		driver.close();

	}

}
