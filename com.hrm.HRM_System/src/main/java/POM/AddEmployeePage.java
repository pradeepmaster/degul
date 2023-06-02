package POM;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import hrmGenericUtilities.JavaUtility;
import hrmGenericUtilities.WebDriverUtility;

public class AddEmployeePage {

	
	@FindBy(xpath="//button[@class='btn btn-primary' and contains(.,'Add Employee')]")private WebElement addEmployeeBtn;
	
	@FindBy(xpath="//h4[.='Add Employee']/ancestor::div[@class='modal-content']/descendant::input[@name='employee_companyid']")private WebElement companyIdTxtEdt;
	@FindBy(xpath="//h4[.='Add Employee']/ancestor::div[@class='modal-content']/descendant::input[@name='employee_firstname']")private WebElement firstNameTxtEdt;
	@FindBy(xpath="//h4[.='Add Employee']/ancestor::div[@class='modal-content']/descendant::input[@name='employee_lastname']")private WebElement lastNameTxtEdt;
	@FindBy(xpath="//h4[.='Add Employee']/ancestor::div[@class='modal-content']/descendant::input[@name='employee_middlename']")private WebElement middleNameTxtEdt;
	@FindBy(xpath="//h4[.='Add Employee']/ancestor::div[@class='modal-content']/descendant::input[@name='branches_datefrom']")private WebElement fromDateTxtEdt;
	@FindBy(xpath="//h4[.='Add Employee']/ancestor::div[@class='modal-content']/descendant::input[@name='branches_recentdate']")private WebElement recentDateTxtEdt;
	@FindBy(xpath="//h4[.='Add Employee']/ancestor::div[@class='modal-content']/descendant::select[@name='employee_department']")private WebElement departmentDropDown;
	@FindBy(xpath="//h4[.='Add Employee']/ancestor::div[@class='modal-content']/descendant::select[@name='employee_branches']")private WebElement branchDropDown;
	@FindBy(xpath="//h4[.='Add Employee']/ancestor::div[@class='modal-content']/descendant::input[@name='employee_position']")private WebElement postionTxtEdt;
	@FindBy(xpath="//h4[.='Add Employee']/ancestor::div[@class='modal-content']/descendant::input[@name='employee_contact']")private WebElement contactNumberTxtEdt;
	@FindBy(xpath="//h4[.='Add Employee']/ancestor::div[@class='modal-content']/descendant::input[@name='employee_sss']")private WebElement sssTxtEdt;
	@FindBy(xpath="//h4[.='Add Employee']/ancestor::div[@class='modal-content']/descendant::input[@name='employee_tin']")private WebElement tinTxtEdt;
	@FindBy(xpath="//h4[.='Add Employee']/ancestor::div[@class='modal-content']/descendant::input[@name='employee_hdmf_pagibig']")private WebElement hdmfTxtEdt;
	@FindBy(xpath="//h4[.='Add Employee']/ancestor::div[@class='modal-content']/descendant::input[@name='employee_gsis']")private WebElement gsisTxtEdt;
	@FindBy(xpath="//h4[.='Add Employee']/ancestor::div[@class='modal-content']/descendant::input[contains(@name,'employee_file')]")private WebElement fileUploadEle;
	@FindBy(xpath="//h4[.='Add Employee']/ancestor::div[@class='modal-content']/descendant::input[@name='employee_image']")private WebElement employeePictureEle;
	@FindBy(xpath="//h4[.='Add Employee']/ancestor::div[@class='modal-content']/descendant::button[@name='emplo']")private WebElement saveBtn;
	@FindBy(xpath="//h4[.='Add Employee']/ancestor::div[@class='modal-content']/descendant::button[.='Close']")private WebElement closeBtn;
	
	@FindBy(xpath="//input[@aria-controls='example1']")private WebElement searchTxtBar;
	@FindBy(xpath="//select[@name='example1_length']")private WebElement showDropDwon;
	
//	initilization
	public AddEmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * This method click on AddEmployee button on topRight corner
	 */
	public void clickOnAddEmployeeBtn() {
		addEmployeeBtn.click();
		
	}
	/**
	 * This method fill the form to create a new Employee and click on Save button 
	 * @param wLib
	 * @param companyId
	 * @param firstName
	 * @param lastName
	 * @param middleName
	 * @param fromDate
	 * @param recentDate
	 * @param visibleDName
	 * @param visibleBName
	 * @param postion
	 * @param contactNo
	 * @param sssNo
	 * @param tinNo
	 * @param hdmfNo
	 * @param fileRelativePath
	 * @param pictureRelativePath
	 */
	public void createNewEmployeeAndSave(WebDriverUtility wLib,String companyId,String firstName,String lastName,String middleName,String fromDate,String recentDate,String visibleDName,String visibleBName,String postion,String contactNo,String sssNo,String tinNo,String hdmfNo,String gsis,String fileRelativePath,String pictureRelativePath) {
		companyIdTxtEdt.sendKeys(companyId);
		firstNameTxtEdt.sendKeys(firstName);
		lastNameTxtEdt.sendKeys(lastName);
		middleNameTxtEdt.sendKeys(middleName);
		fromDateTxtEdt.sendKeys(fromDate);
		recentDateTxtEdt.sendKeys(recentDate);
		wLib.selectElementInDropDown(visibleDName, departmentDropDown);
		wLib.selectElementInDropDown(visibleBName, branchDropDown);
		postionTxtEdt.sendKeys(postion);
		contactNumberTxtEdt.sendKeys(contactNo);
		sssTxtEdt.sendKeys(sssNo);
		tinTxtEdt.sendKeys(tinNo);
		hdmfTxtEdt.sendKeys(hdmfNo);
		gsisTxtEdt.sendKeys(gsis);
		wLib.fileUploadPopup(fileUploadEle,fileRelativePath);
		wLib.fileUploadPopup(employeePictureEle,pictureRelativePath);
		saveBtn.click();
	}
	/**
	 * This method verifies the employee is created Successfully or not using Firstname
	 * @param driver
	 * @param fName
	 */
	public void verifyEmployeeIsAdded(WebDriverUtility wLib, WebDriver driver,String fName ) {
		wLib.selectElementInDropDown("100", showDropDwon);
		List<WebElement> allEmp = driver.findElements(By.xpath("//td[3]"));
		Iterator<WebElement> al=allEmp.iterator();
		int count=0;
		while(al.hasNext()) {
			String name=al.next().getText();
			if(name.equals(fName))
			{
				System.out.println("Employee Name is Created");
				count++;
				break;
			}
		}
		if(count==0) {
			System.err.println("Employee is Not Created");
		}
	}
	
	public void assetVerifyEmployee(WebDriverUtility wLib, WebDriver driver,String fName ) {
		wLib.selectElementInDropDown("100", showDropDwon);
		List<WebElement> allEmp = driver.findElements(By.xpath("//td[3]"));
		Iterator<WebElement> al=allEmp.iterator();
		int count=0;
		while(al.hasNext()) {
			String name=al.next().getText();
			Assert.assertTrue(name.contains(fName),"Added");
		}
		
	}
	
	
	
	/**
	 * This method click on close Button
	 */
	public void clickOnCloseBtn() {
		closeBtn.click();
	}
	
	/**
	 * This method search the employee using search box
	 * @param companyId
	 */
	public void searchEmployeeName(String companyId) {
		searchTxtBar.sendKeys(companyId);
	}
	/**
	 * This method delete the employee using Company ID and First Name of Employee
	 * @param driver
	 * @param comID
	 * @param fName
	 * @throws InterruptedException
	 */
	public void deleteEmployeeByCompanyId(WebDriver driver ,String comID,String fName) throws InterruptedException {
//		clicking on the deleteing Employee name
//		driver.findElement(By.xpath("//td[1][.='"+comID+"']")).click();
		
//		clicking on deleteBtn
		driver.findElement(By.xpath("//td[.='"+comID+"']/../descendant::i[@title='Delete Employee']")).click();
		
		Thread.sleep(2000);
//		Confirm the delete button
		driver.findElement(By.xpath("//input[contains(@value,'"+fName+"')]/../following-sibling::div[@class='modal-footer justify-content-between']/button[.='Delete']")).click();
	}
	/**
	 * This method verify the employee is deleted successfully or not
	 * @param driver
	 * @param comID
	 */
	public void verifyEmployeeDeleted(WebDriver driver,String comID) {
		List<WebElement> allEmpID = driver.findElements(By.xpath("//td[1]"));
		Iterator<WebElement> al1=allEmpID.iterator();
		int count1=0;
		while(al1.hasNext()) {
			String id=al1.next().getText();
			if(id.equals(comID)) {
				System.err.println("Not deleted");
				count1++;
				break;
			}
		}
		if(count1==0) {
			System.out.println("Successfully Deleted");
		}
	}
	
	public void assertVerifyEmployeeDeleted(WebDriver driver,String comID) {
		List<WebElement> allEmpID = driver.findElements(By.xpath("//td[1]"));
		Iterator<WebElement> al1=allEmpID.iterator();
		int count1=0;
		while(al1.hasNext()) {
			String id=al1.next().getText();
			if(id.equals(comID)) {
				System.err.println("Not deleted");
				count1++;
				break;
			}
		}
		if(count1==0) {
			System.out.println("Successfully Deleted");
		}
	}
	
	
	
	/**
	 * This method edit the given employee company Id and click on Update
	 * @param jLib
	 * @param driver
	 * @param fName
	 * @param comID
	 * @throws InterruptedException 
	 */
	public void editEmployeeCompanyId(JavaUtility jLib,WebDriver driver, String fName,String comID) throws InterruptedException {
		searchEmployeeName(fName);
		
		driver.findElement(By.xpath("//td[.='"+fName+"']/../td[@class='sorting_1']")).click();
		driver.findElement(By.xpath("//td[.='"+fName+"']/../following-sibling::tr[@class='child']/descendant::i[@title='Edit Employee']")).click();
//		Editing Company ID
		String comID1=jLib.getRandomNumber()+"";
		driver.findElement(By.xpath("//h4[.='Edit Employee']/ancestor::div[@class='modal-content']/descendant::input[@name='employee_companyid' and @value='"+comID+"']")).clear();
		driver.findElement(By.xpath("//h4[.='Edit Employee']/ancestor::div[@class='modal-content']/descendant::input[@name='employee_companyid' and @value='"+comID+"']")).sendKeys(comID1);
//		clicking on the update
		driver.findElement(By.xpath("(//h4[.='Edit Employee']/ancestor::div[@class='modal-content']/descendant::button[@name='edit_emplo'])[1]")).click();
	}

	
}
