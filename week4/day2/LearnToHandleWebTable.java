package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnToHandleWebTable {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/table.xhtml");

		List<WebElement> allRows = driver
				.findElements(By.xpath("(//span[text()='Customer Analytics Table']/following::table)[2]/tbody/tr"));

		for (int i = 1; i <= allRows.size(); i++) { // 1,2,3,4,5,6,7,8,9,10
			List<WebElement> allTds = driver.findElements(
					By.xpath("(//span[text()='Customer Analytics Table']/following::table)[2]/tbody/tr[" + i + "]/td"));

			for (int j = 1; j <= allTds.size(); j++) {

				String text = driver.findElement(
						By.xpath("(//span[text()='Customer Analytics Table']/following::table)[2]/tbody/tr[" + i
								+ "]/td[" + j + "]"))
						.getText();
				System.out.println(text);
			}

		}

	}

}
