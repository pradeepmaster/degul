package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import hrmGenericUtilities.WebDriverUtility;

public class HomePage {

	//Decleration
	@FindBy(xpath="//p[contains(.,'CORPORATE')]") 
	private WebElement corporateModuleBtn;
	@FindBy(xpath="//p[.='Add Corporate']") 
	private WebElement addCorporateBtn;
	
	@FindBy(xpath="//p[contains(.,'BRANCHES')]") 
	private WebElement branchesModuleBtn;
	@FindBy(xpath="//p[.='Add Braches']")
	private WebElement addBranchBtn;
	
	@FindBy(xpath="//p[contains(.,' EMPLOYEE')]")
	private WebElement employeeModuleBtn;
	@FindBy(xpath="//p[.='Add Employee']")
	private WebElement addEmployeeBtn;
	
	@FindBy(xpath="//p[contains(.,'ADMIN')]") 
	private WebElement adminModuleBtn;
	@FindBy(xpath="//p[.='Add Admin']") 
	private WebElement addAdminBtn;
	
	@FindBy(xpath="//i[@class='fa fa-user']") 
	private WebElement logoutBtnLogo;
	@FindBy(xpath="//a[@href='log_out.php']") 
	private WebElement logoutBtn;
	
	//initilization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getCorporateElement() {
		return employeeModuleBtn;
	}
	//utilization
	public void logOutFromApp() {
		logoutBtnLogo.click();
		logoutBtn.click();
	}
    public void getAdminModuleBtn(){
    	adminModuleBtn.click();
    	addAdminBtn.click();
    }
    
    public void getEmployeeModuleBtn() {
    	employeeModuleBtn.click();
    	addEmployeeBtn.click();
    }
	
    public void getCorporateModuleBtn()  {
    	corporateModuleBtn.click();
    	addCorporateBtn.click();
    }
	
//	Verifying the Home page is displaying or not
    public void verifyHomePage(WebDriver driver) {
	String aTitle = driver.getTitle();
	Assert.assertTrue(aTitle.contains("Admin"),"Home Page is Displaying");
    }



}
