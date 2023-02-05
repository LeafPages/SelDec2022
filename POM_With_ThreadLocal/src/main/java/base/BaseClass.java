package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ReadExcelData;

public class BaseClass extends AbstractTestNGCucumberTests{

	//public static ChromeDriver driver;
	//declare driver as ThreadLocal instance
	private static final ThreadLocal<RemoteWebDriver> remoteWebDriver = new ThreadLocal<RemoteWebDriver>();

	public String excelFileName; // initial value is null
	
	public void setDriver() {
		remoteWebDriver.set(new ChromeDriver());
	}
	
	public RemoteWebDriver getDriver() {
		return remoteWebDriver.get();
	}

	@DataProvider(name = "fetchData", indices=0)
	public String[][] sendData() throws IOException {
		return ReadExcelData.readData(excelFileName);

	}

	@BeforeMethod
	public void preCondition() {
		setDriver();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		getDriver().get("http://leaftaps.com/opentaps");
	}

	@AfterMethod
	public void postCondition() {
		getDriver().close();

	}

}
