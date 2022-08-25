package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.CreatAccountButtonModel;

public class CreateAccountButtonPage extends CreatAccountButtonModel {
	
  public CreateAccountButtonPage(WebDriver driver) {
	 super(driver); 
	  
  }
  
   public void getCreateAccount() {
	   WebElement createaccount = createAccount();
	   createaccount.click();
   }
}
