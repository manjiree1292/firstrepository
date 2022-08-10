package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginUsingPropertyFile {

	@Test
	
	public void validLogin() throws IOException
	{
		File file=new File("C:\\Users\\shyam\\eclipse-workspace\\com.codemind.project\\src\\test\\resources\\test.properties");
		FileInputStream fis=new FileInputStream(file);
		
		
		Properties properties=new Properties();
		properties.load(fis);
		System.out.println("get method from property file"+ properties.get("userName"));
		
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys((String)properties.get("userName"));	
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys((String)properties.get("password"));
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//properties.setProperty("username2", "test2");
		//properties.put("key1", "pass2");
		
		FileOutputStream fos=new FileOutputStream(file,true);
		
		properties.setProperty("userName3", "password3");
		properties.store(fos,"This is write");
		fos.close();
		fis.close();
		
		
	}
}
