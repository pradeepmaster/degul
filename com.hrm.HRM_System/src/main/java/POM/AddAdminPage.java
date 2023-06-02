package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hrmGenericUtilities.WebDriverUtility;
import xpathPOM.AddAdminPageXpaths;

public class AddAdminPage extends AddAdminPageXpaths  {
    
	@FindBy(xpath=_addAdminBtn)
	private WebElement addAdminBtn;
	
	@FindBy(xpath=companyIdTxtEdt1)
	private WebElement companyIdTxtEdt;
	
	@FindBy(xpath=firstNameTxtEdt1)
	private WebElement firstNameTxtEdt;
	
	@FindBy(xpath=lastNameTxtEdt1)
	private WebElement lastNameTxtEdt;
	
	@FindBy(xpath=middleNameTxtEdt1)
	private WebElement middleNameTxtEdt;
	
	@FindBy(xpath=contactNoTxtEdt1)
	private WebElement contactNoTxtEdt;
	
	@FindBy(xpath=postionSelectType1)
	private WebElement postionSelectType;
	
	@FindBy(xpath=emailAddressTxtEdt1)
	private WebElement emailAddressTxtEdt;
	
	@FindBy(xpath=passwordTxtEdt1)
	private WebElement passwordTxtEdt;
	
	@FindBy(xpath=saveBtn1)
	private WebElement saveBtn;
	
	@FindBy(xpath=closeBtn1)
	private WebElement closeBtn;
	
	@FindBy(xpath=showDropDwon1)
	private WebElement showDropDwon;
	
	
	
	//initlization
	public AddAdminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization
	public void getAddAdminBtn() {
		addAdminBtn.click();
	}
	
	//Filling the form to Create a New Admin and save
	public void addNewAdminDataAndSave(String companyId,String firstName,String lastName,String middleName,String contactNo,WebDriverUtility wLib,String visibleTxt,String email,String password) 
	{
		companyIdTxtEdt.sendKeys(companyId);
		firstNameTxtEdt.sendKeys(firstName);
		lastNameTxtEdt.sendKeys(lastName);
		middleNameTxtEdt.sendKeys(middleName);
		contactNoTxtEdt.sendKeys(contactNo);
		wLib.selectElementInDropDown(visibleTxt, postionSelectType);
		emailAddressTxtEdt.sendKeys(email);
		passwordTxtEdt.sendKeys(password);
		saveBtn.click();
	}
	
//	logging out from the application
	public void closeThePopup(){
		closeBtn.click();
	}
	
//	handling the show dropdown menu and selecting 100
	public void showSelect100(WebDriverUtility wLib,String vText) {
		wLib.selectElementInDropDown(showDropDwon, vText);
	}
	
	
	
}
