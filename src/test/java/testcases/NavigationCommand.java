package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationCommand {
	@Test
	
	public void nav() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shyam\\Selenium setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//Take Screenshot
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File file=screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\shyam\\eclipse-workspace\\com.codemind.project\\src\\test\\resources\\test.png"));
		
		
		
	}
	
	
	

}
