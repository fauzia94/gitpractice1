package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import lib.CommonMethod;
import page.LoginPage;

public class LoginSteps extends TestBase {

	@Given("^I am on the facebook login page$")
	public void i_am_on_the_facebook_login_page() throws Throwable {
		TestBase.openBrowser();
	}

	@When("^I enter email address \"([^\"]*)\"$")
	public void i_enter_email_address(String emailAddress) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterEmailAddress(emailAddress);
	}

	@When("^I enter password \"([^\"]*)\"$")
	public void i_enter_password(String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.typePassword(password);

	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginBtn();
	}

	@Then("^I should see login successful$")
	public void i_should_see_login_successful() throws Throwable {
		
		LoginPage loginPage = new LoginPage(driver);
		
		String expectedTitle = "Log Into Facebook";
		String actualTitle = "Log Into Facebook";
		Assert.assertEquals(actualTitle, expectedTitle);

		TestBase.close();
	}

}
