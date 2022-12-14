package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToHandleFrame {
@Test
	public void handlingFrame() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shyam\\Selenium setup\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/frames");
	driver.manage().window().maximize();
	
	//get current url 
	System.out.println("Current URL: "+ driver.getCurrentUrl());
	
	//get title
	System.out.println("Title:" + driver.getTitle());
	System.out.println("Page Source:"+ driver.getPageSource());
	
	WebElement element=driver.findElement(By.xpath("//iframe[@id='frame1']"));
	//driver.switchTo().frame(element);
	String str=driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
	System.out.println(str);
	//driver.switchTo().defaultContent();
	System.out.println(driver.findElement(By.xpath("//header/a")).getAttribute("href"));
	
	
}
}
