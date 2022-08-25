package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;
import page.CreateAccountButtonPage;
import page.CreateAccountPage;

public class TestBase {
	static WebDriver driver;
	
	public static void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
	
	public static CreateAccountButtonPage createAccount() {
		
		CreateAccountButtonPage ca = new CreateAccountButtonPage(driver);
		
		return ca;
	}
	
	public static CreateAccountPage createAccountPage() {
		
	CreateAccountPage createAccount = new CreateAccountPage(driver);
	
	 return createAccount;
	}
  
    public static void close() {
    	driver.quit();
    	
    }
}
