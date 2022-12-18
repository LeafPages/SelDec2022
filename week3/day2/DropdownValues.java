package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownValues {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml;jsessionid=node0jd2i5fsdk7om1fuuzdnluxneq481327.node0");
		driver.manage().window().maximize();
		
		WebElement dd = driver.findElement(By.xpath("//h5[text()='Which is your favorite UI Automation tool?']/following::select[1]"));
		
		Select dropdown = new Select(dd);
		List<WebElement> options = dropdown.getOptions();
		System.out.println(options.size());
		
		
	}

}
