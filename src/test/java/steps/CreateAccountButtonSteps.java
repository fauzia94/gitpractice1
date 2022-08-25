package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.CreateAccountButtonPage;

public class CreateAccountButtonSteps extends TestBase {

	@Given("^I am on the facebook page$")
	public void i_am_on_the_facebook_page() throws Throwable {
		openBrowser();
	}

	@When("^I click on create account button$")
	public void i_click_on_create_account_button() throws Throwable {
		createAccount();
		CreateAccountButtonPage ca = new CreateAccountButtonPage(driver);
		ca.getCreateAccount();
	}

	@Then("^I am on the facebook create account page$")
	public void i_am_on_the_facebook_create_account_page() throws Throwable {
		CreateAccountButtonPage ca = new CreateAccountButtonPage(driver);
		
		String expectedTitle = "Sign Up";
		String actualTitle = "Sign Up";
		Assert.assertEquals(actualTitle, expectedTitle);
		TestBase.close();
	}
}
