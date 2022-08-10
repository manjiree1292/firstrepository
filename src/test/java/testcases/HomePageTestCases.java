package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import utility.Utility;

public class HomePageTestCases {
	
	HomePage homePage;
	WebDriver driver;
	
	
	@BeforeClass
	public void launchURL()
	{
		driver=Utility.getDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		homePage=new HomePage(driver);
	}
	
	@Test
	public void verifyFormFieldSeletion()
	{
		homePage.setUserNameTextBox();
		homePage.getUserNameTextBox().sendKeys("Shyam");
		
		homePage.setLastNameTextBox();
		homePage.getLastNameTextBox().sendKeys("Maradkar");
		
		homePage.setEmailTextBox();
		homePage.getEmailTextBox().sendKeys("shyam12@gmail.com");
		
		homePage.setGenderRadioButton();
		//homePage.getGenderRadioButton().click();
		Utility.clickUsingJavaScript(homePage.getGenderRadioButton(), driver);
		
		homePage.setDateOfBirthInput();
		Utility.scrollIntoView(homePage.getDateOfBirthInput(), driver);
		homePage.getDateOfBirthInput().click();
		
		WebElement select=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Utility.selectValueFromDropDown(select, "2011");
		Utility.selectDateFromDatePicker(driver, "9");
		
		homePage.setHobbiesCheckBox();
		Utility.clickUsingJavaScript(homePage.getHobbiesCheckBox(), driver);
		
		homePage.getFileUpload().sendKeys("C:\\Users\\shyam\\ManjireeTextFile.docx"); 
		
		
		
		
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
	

}
