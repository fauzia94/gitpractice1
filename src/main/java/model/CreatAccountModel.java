package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib.CommonMethod;

public class CreatAccountModel {

	 WebDriver driver;

	public CreatAccountModel(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement firstName() {
		
		CommonMethod cm = new CommonMethod(driver);
		cm.waitForElement("//input[@name='firstname']");

		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));

		return firstname;
	}

	public WebElement lastName() {
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));

		return lastname;
	}

	public WebElement enterEmail() {
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));

		return email;
	}

	public WebElement newPassword() {
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));

		return password;
	}
	
	public WebElement birthMonth() {
		WebElement birthmonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));

		return birthmonth;
	}
	
	public WebElement birthDay() {
		WebElement birthday = driver.findElement(By.xpath("//select[@name='birthday_day']"));

		return birthday;
	}
	public WebElement birthYear() {
		WebElement birthyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));

		return birthyear;
	}
	
	public WebElement gender(String gender) {
		WebElement selectGender = driver.findElement(By.xpath("//label[text()='"+ gender +"']/following-sibling::input"));

		return selectGender;
	}
	

}
