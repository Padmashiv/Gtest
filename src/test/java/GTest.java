import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GTest {
	@Test
	public void gtest() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("q")).sendKeys("Capgemini");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//a[@data-hveid='CAIQBA']")).click();;
		System.out.println("****************" + "Current Url : " + "********************" );
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		driver.close();
	}
}



 
