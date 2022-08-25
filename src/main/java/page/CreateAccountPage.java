package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import lib.CommonMethod;
import model.CreatAccountModel;

public class CreateAccountPage extends CreatAccountModel {

	public CreateAccountPage(WebDriver driver) {
		super(driver);

	}

	public void typeFirstName(String firstname) {

		WebElement firstName = firstName();
		firstName.sendKeys(firstname);
	}

	public void typeLastName(String lastname) {

		WebElement lastName = lastName();
		lastName.sendKeys(lastname);
	}

	public void typeEmail(String email) {

		WebElement typeemail = enterEmail();
		typeemail.sendKeys(email);
	}

	public void Password(String password) {

		WebElement typePassword = newPassword();
		typePassword.sendKeys(password);
	}

	public void selectBirthMonth(String month) {

		WebElement birthMonth = birthMonth();

		CommonMethod.dropDown(birthMonth, month);
	}

	public void selectBirthDay(String day) {

		WebElement birthDay = birthDay();
		CommonMethod.dropDown(birthDay, day);

	}

	public void selectBirthYear(String year) {

		WebElement birthyear = birthYear();
		CommonMethod.dropDown(birthyear, year);

	}

	public void typeGender(String gender) {
		WebElement genderSelect = gender(gender);

		genderSelect.click();
		
	}

}
