package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginModel{
 
   WebDriver driver;
   public LoginModel( WebDriver driver) {
	 this.driver = driver;
 }
   
   public WebElement getEmailAddress() {
		
	WebElement  emailAddress = driver.findElement(By.xpath("//input[@name='email']"));
	   
	return emailAddress;   
   }
   
   
   public WebElement getPassword() {
	WebElement  password = driver.findElement(By.xpath("//input[@name='pass']"));
	   
	return password;   
   }
   
   public WebElement loginPage() {
	  
		WebElement  login = driver.findElement(By.xpath("//button[@name='login']"));
		   
		return login;   
	   }
   
 }
	


