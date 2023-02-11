package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utils.ReadExcelData;

public class BaseClass {

	public ChromeDriver driver;

	public String excelFileName; // initial value is null
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testName, testDescription, testAuthor, testCategory; // null value

	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		reporter.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	
	@BeforeClass
	public void testDetails() {
		test = extent.createTest(testName, testDescription);
		test.assignCategory(testCategory);
		test.assignAuthor(testAuthor);
	}
	
	public int takeSnap() throws IOException {
		
		int ranNum = (int) (Math.random() * 999999 + 1000000);
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/img"+ranNum+".png");
		FileUtils.copyFile(source, target);
		
		return ranNum;
	}
	
	
	
	
	
	public void reportStep(String stepInfo, String status) throws IOException {
		int snapNum = takeSnap();
		
		if(status.equalsIgnoreCase("pass")) {
			test.pass(stepInfo,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+snapNum+".png").build());
		}else if(status.equalsIgnoreCase("fail")) {
			test.fail(stepInfo,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+snapNum+".png").build());
			throw new RuntimeException("See the ExtentReport for more details");
		}
	}
	
	
	
	
	
	
	
	@AfterSuite
	public void stopReport() {
		extent.flush();
	}
	
	
	
	
	
	
	
	

	@DataProvider(name = "fetchData", indices=0)
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
