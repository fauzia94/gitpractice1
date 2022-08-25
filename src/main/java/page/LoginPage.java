package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.LoginModel;


public class LoginPage extends LoginModel {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void enterEmailAddress(String emailAddress) {
		WebElement userName = getEmailAddress();
		userName.sendKeys(emailAddress);
	}

	public void typePassword(String password) {
		WebElement pass = getPassword();
		pass.sendKeys(password);
	}

	public void loginBtn() {
		WebElement login = loginPage();
		login.click();
	}
}
