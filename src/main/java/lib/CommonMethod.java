package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethod {
	
	static WebDriver driver;
	public CommonMethod (WebDriver driver) {
		this.driver = driver;
	}
	
	
	public static void dropDown(WebElement locator,String value) {
	
	Select select = new Select(locator);
	select.selectByVisibleText(value);
	
	}
	
	public static void waitForElement(String locator) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
	}
}
