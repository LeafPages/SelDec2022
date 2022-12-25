package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Erail {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://erail.in/");

		// from station
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("ms");
		fromStation.sendKeys(Keys.TAB);

		// to station
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("mdu");
		toStation.sendKeys(Keys.TAB);

		// uncheck sort on date
		driver.findElement(By.id("chkSelectDateOnly")).click();

		// to find the number of rows
		List<WebElement> allRows = driver.findElements(
				By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr"));

		Set<String> setOfTrainNames = new LinkedHashSet<String>();

		for (int i = 2; i <= allRows.size(); i++) {

			String text = driver.findElement(
					By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr[" + i
							+ "]/td[2]"))
					.getText();
		//	System.out.println(text);
			if(!setOfTrainNames.add(text)) {
				System.out.println(text);
			}
		}
		// 28 //27
		if (allRows.size() - 1 == setOfTrainNames.size()) {
			System.out.println("No duplicates");
		} else {
			System.out.println("Duplicate train names are there");
		}

	}

}
