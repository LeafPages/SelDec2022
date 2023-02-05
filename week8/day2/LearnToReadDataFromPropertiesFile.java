package week8.day2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnToReadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		//setup the path of file to read data
		FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
		
		//Create object for Properties
		Properties prop = new Properties();
		
		//load the properties from the file
		prop.load(fis);
		
			
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		//to write the data
		FileOutputStream fos = new FileOutputStream("src/main/resources/config.properties");
						//Key		Value
		prop.setProperty("LeadId", "10335");
		
		prop.store(fos, "this is for demo");
		
		
		
		//to get a single property
				/*String property1 = prop.getProperty("url");
				System.out.println(property1);
				
				String property2 = prop.getProperty("username");
				System.out.println(property2);
				
				String property3 = prop.getProperty("password");
				System.out.println(property3);*/
		
		
		
		
		
		
		
		
		
		
		

	}

}
