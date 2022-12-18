package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonBooks {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones", Keys.ENTER);
		
		List<WebElement> allPhonePrices = driver.findElements(By.className("a-price-whole"));
		List<Integer> allPrices = new ArrayList<>();
		
		for (int i = 0; i < allPhonePrices.size(); i++) {
			System.out.println(allPhonePrices.get(i).getText());
			String price = allPhonePrices.get(i).getText().replaceAll(",", "");
			if(!price.trim().equals("")) {
				int finalPrice = Integer.parseInt(price);
				if(finalPrice > 0) {
					allPrices.add(finalPrice);
				}
			}
		}
				
		Collections.sort(allPrices);
		System.out.println("Min Price "+allPrices.get(0));
		
		
	}

}
