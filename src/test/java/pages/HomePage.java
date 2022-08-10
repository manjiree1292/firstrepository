package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	WebElement userNameTextBox;
	WebElement lastNameTextBox; 
	WebElement emailTextBox;
	WebElement genderRadioButton;
	WebElement dateOfBirthInput;
	WebElement hobbiesCheckBox;
	WebElement fileUpload;
	
	
	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
		
	}

	public WebElement getUserNameTextBox() {
		return userNameTextBox;
	}

	public void setUserNameTextBox() {
		this.userNameTextBox =driver.findElement(By.xpath("//input[@id='firstName']"));
	}

	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}

	public void setLastNameTextBox() {
		this.lastNameTextBox =driver.findElement(By.xpath("//input[@id='lastName']")) ;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public void setEmailTextBox() {
		this.emailTextBox = driver.findElement(By.xpath("//input[@id='userEmail']"));
	}

	public WebElement getGenderRadioButton() {
		return genderRadioButton;
	}

	public void setGenderRadioButton() {
		this.genderRadioButton = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
	}

	public WebElement getDateOfBirthInput() {
		return dateOfBirthInput;
	}

	public void setDateOfBirthInput() {
		this.dateOfBirthInput = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
	}

	public WebElement getHobbiesCheckBox() {
		return hobbiesCheckBox;
	}

	public void setHobbiesCheckBox() {
		this.hobbiesCheckBox = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
	}

	public WebElement getFileUpload() {
		this.fileUpload=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		return fileUpload;
	}
	
	
	

}
