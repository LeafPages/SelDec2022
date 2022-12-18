package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfLinks {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/link.xhtml;jsessionid=node0jd2i5fsdk7om1fuuzdnluxneq481327.node0");
		driver.manage().window().maximize();
		
		//WebElement firstLink = driver.findElement(By.tagName("a"));
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		WebElement second = allLinks.get(1);
		System.out.println(second.getText());
		
		for (int i = 0; i < allLinks.size(); i++) {
			WebElement ele = allLinks.get(i);
			System.out.println(ele.getText());
		}
		
	}

}
