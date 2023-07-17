package com.hrm.Employee;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import POM.AddEmployeePage;
import POM.HomePage;
import POM.LoginPage;
import hrmGenericUtilities.BaseClass;
import hrmGenericUtilities.ExcelUtility;
import hrmGenericUtilities.FileUtility;
import hrmGenericUtilities.JavaUtility;
import hrmGenericUtilities.WebDriverUtility;

public class ModifyEmployee extends BaseClass {

	@Test(groups="regressionTest")
	public void createEmployeeAsHrHeadAndDelete() throws EncryptedDocumentException, IOException, InterruptedException {
		LoginPage loginPage=new LoginPage(driver);
		HomePage homePage=new HomePage(driver);
		AddEmployeePage addEmployeePage=new AddEmployeePage(driver);
		String text="su";

		wLib.switchToAlertPopupAcceptAndPrintTxt(driver);

//		Verifying the Home page is displaying or not
//		homePage.verifyHomePage(driver);
		
//		clicking on Employee module on Left Navigation bar
		homePage.getEmployeeModuleBtn();
		
//		clicking on Add Employee button on RightTop corner
		addEmployeePage.clickOnAddEmployeeBtn();
		
		
		int ranNum=jLib.getRandomNumber();
//		entering company Id in Text field
		String sheetName="addEmployee";
		String comID=jLib.getRandomNumber()+"";
		String fName=eLib.getExcelData(sheetName, 1,1)+ranNum;
		String lName=eLib.getExcelData(sheetName, 1,2);
		String mName=eLib.getExcelData(sheetName, 1,3);
		String fromDate=eLib.getExcelData(sheetName, 1,4);
		String recentDate=eLib.getExcelData(sheetName, 1, 5);
		String dName="ClickIt";
		String bName="Villasis Branch";
		String post=eLib.getExcelData(sheetName, 1,6);
		String con=eLib.getExcelData(sheetName, 1,7);
		String eSSS=eLib.getExcelData(sheetName, 1,8)+"";
		String tin=eLib.getExcelData(sheetName, 1,9)+"";
		String hdmf=eLib.getExcelData(sheetName, 1,10)+"";
		String gsis=eLib.getExcelData(sheetName, 1,11)+"";
		String relativePath=".\\src\\test\\resources\\data\\HRM_TC.xlsx";
		String relativePath1=".\\\\src\\\\test\\\\resources\\\\data\\\\Untitled.jpg";
		
//		creating a new Employee
		addEmployeePage.createNewEmployeeAndSave(wLib, comID, fName, lName, mName, fromDate, recentDate, dName, bName, post, con, eSSS, tin, hdmf,gsis, relativePath, relativePath1);
		
//		Clicking on ok button in Logout alert popup
		wLib.switchToAlertPopupAndAccept(driver, text);
		
//		verifying the Employee name is added or not
		addEmployeePage.verifyEmployeeIsAdded(wLib,driver, fName);
		
//		logout from the application
		homePage.logOutFromApp();
		
//		handling the alert
		wLib.switchToAlertPopupAcceptAndPrintTxt(driver);
		
//		Login as another HR head
		String Username = fLib.getPropertyFileKeyValue("headUsername1");
		String Password = fLib.getPropertyFileKeyValue("headPassword1");
		String visibleTxt=fLib.getPropertyFileKeyValue("hrHeadVisibleTxt");
		
//		logging to application
		loginPage.loginToApp(Username, Password, visibleTxt);
		
		Thread.sleep(2000);
//		Clicking ok on Alert popup
		wLib.switchToAlertPopupAndAccept(driver, text);
		
//		Verifying the Home page is displaying or not
		homePage.verifyHomePage(driver);
		
//		clicking on Employee module on Left Navigation bar
		homePage.getEmployeeModuleBtn();
		
//		this method edit the employee Company ID and click on update
		addEmployeePage.editEmployeeCompanyId(jLib,driver,fName,comID);
		
//		logging out from application
		homePage.logOutFromApp();
	}

}
