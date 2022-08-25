package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatAccountButtonModel {
	
	WebDriver driver;
	public CreatAccountButtonModel(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement createAccount() {
	WebElement 	createAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
		
	return createAcc;	
	}

}
