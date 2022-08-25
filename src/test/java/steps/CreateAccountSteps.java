package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.CreateAccountPage;
import page.LoginPage;

public class CreateAccountSteps extends TestBase  {

	@When("^I type first name \"([^\"]*)\"$")
	public void i_type_first_name(String firstname) throws Throwable {
		createAccountPage();
		CreateAccountPage createAccount = new CreateAccountPage(driver);
		createAccount.typeFirstName(firstname);
	}

	@When("^I type last name \"([^\"]*)\"$")
	public void i_type_last_name(String lastname) throws Throwable {
		CreateAccountPage createAccount = new CreateAccountPage(driver);
		createAccount.typeLastName(lastname);
	}

	@When("^I enter email \"([^\"]*)\"$")
	public void i_enter_email(String email) throws Throwable {
		CreateAccountPage createAccount = new CreateAccountPage(driver);
		createAccount.typeEmail(email);
	}

	@When("^I enter new password \"([^\"]*)\"$")
	public void i_enter_new_password(String password) throws Throwable {
		CreateAccountPage createAccount = new CreateAccountPage(driver);
		createAccount.Password(password);
	}

	@When("^I select birth month\"([^\"]*)\"$")
	public void i_select_birth_month(String month) throws Throwable {
		CreateAccountPage createAccount = new CreateAccountPage(driver);
		createAccount.selectBirthMonth(month);
	}

	@When("^I select birth day\"([^\"]*)\"$")
	public void i_select_birth_day(String day) throws Throwable {

		CreateAccountPage createAccount = new CreateAccountPage(driver);
		createAccount.selectBirthDay(day);

	}

	@When("^I select birth year\"([^\"]*)\"$")
	public void i_select_birth_year(String year) throws Throwable {

		CreateAccountPage createAccount = new CreateAccountPage(driver);
		createAccount.selectBirthYear(year);

	}

	@When("^I pick gender\"([^\"]*)\"$")
	public void i_pick_gender(String gender) throws Throwable {
		
		CreateAccountPage createAccount = new CreateAccountPage(driver);
		createAccount.typeGender(gender);

	}

	@Then("^I am able to create facebook account successfully$")
	public void i_am_able_to_create_facebook_account_successfully() throws Throwable {
		CreateAccountPage createAccount = new CreateAccountPage(driver);
		
		TestBase.close();
	}

}
