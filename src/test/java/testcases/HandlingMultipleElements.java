package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingMultipleElements {
	
	@Test
	public void handlingMultiEle() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shyam\\Selenium setup\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	List<WebElement> linkOnGooglePage=driver.findElements(By.tagName("a"));
	System.out.println("Number of links on Google : "+linkOnGooglePage.size());
	for(WebElement element:linkOnGooglePage) {
		
		System.out.println(element.getAttribute("href"));
		
	}
	
	}

}
