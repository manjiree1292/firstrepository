package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDownNotCommingUnderSelect {
	@Test
	
	public void dropDown()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shyam\\Selenium setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.airvistara.com/in/en/club-vistara");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		driver.findElement(By.xpath("//img[contains(@src,'dropdown-arrow')]")).click();
		driver.findElement(By.xpath("//ul[@id='country-scroll']//li/span[text()='Nepal']")).click();
		
	}

}
