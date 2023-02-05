package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcelData;

public class BaseClass {

	public ChromeDriver driver;
	public static Properties prop;

	public String excelFileName; // initial value is null

	@DataProvider(name = "fetchData", indices=0)
	public String[][] sendData() throws IOException {
		return ReadExcelData.readData(excelFileName);

	}

	@Parameters({"language"})
	@BeforeMethod
	public void preCondition(String lang) throws IOException {
		if(lang.equals("english")) {
			
			FileInputStream fis = new FileInputStream("src/main/resources/config_english.properties");
			prop = new Properties();
			prop.load(fis);
		}else if(lang.equals("french")) {
			FileInputStream fis = new FileInputStream("src/main/resources/config_french.properties");
			prop = new Properties();
			prop.load(fis);
		}
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(prop.getProperty("url"));
	}

	@AfterMethod
	public void postCondition() {
		driver.close();

	}

}
