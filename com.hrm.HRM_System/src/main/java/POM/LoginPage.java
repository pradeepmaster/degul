package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hrmGenericUtilities.WebDriverUtility;

public class LoginPage extends WebDriverUtility{

		
		//Decleration
		@FindBy (name="hr_email") private WebElement usernameTxtEdt;
		
		@FindBy (name="hr_password") private WebElement passwordTxtEdt;
		
		@FindBy (id="hr_type") private WebElement dropDownType;
		
		@FindBy (name="login_hr") private WebElement signInBtn;
		
		//in
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public WebElement getUsernameTxtEdt() {
			return usernameTxtEdt;
		}

		public WebElement getPasswordTxtEdt() {
			return passwordTxtEdt;
		}

		public WebElement getDropDownType() {
			return dropDownType;
		}

		public WebElement getSignInBtn() {
			return signInBtn;
		}
		
		
		//utilization
		
		//Business
		public void loginToApp(String username,String password,String visibleTxt) {
			usernameTxtEdt.sendKeys(username);
			passwordTxtEdt.sendKeys(password);
			selectElementInDropDown(visibleTxt, dropDownType);
			signInBtn.click();
		}
		

}
