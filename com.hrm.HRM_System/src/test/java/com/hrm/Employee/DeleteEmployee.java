package com.hrm.Employee;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.AddEmployeePage;
import POM.HomePage;
import POM.LoginPage;
import hrmGenericUtilities.BaseClass;
@Listeners(hrmGenericUtilities.ListenerImplement.class)
public class DeleteEmployee extends BaseClass {
	@Test(groups="smokeTest")
	public void createEmployeeAsHrHeadAndDelete() throws EncryptedDocumentException, IOException, InterruptedException {
		LoginPage loginPage=new LoginPage(driver);
		HomePage homePage=new HomePage(driver);
		Assert.fail();
		AddEmployeePage addEmployeePage=new AddEmployeePage(driver);
		String text="su";
		
		wLib.switchToAlertPopupAcceptAndPrintTxt(driver);

//		Verifying the Home page is displaying or not
		homePage.verifyHomePage(driver);
		
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
		addEmployeePage.assetVerifyEmployee(wLib,driver, fName);
		
//		logout from the application
		homePage.logOutFromApp();
		
//		handling the alert
		wLib.switchToAlertPopupAcceptAndPrintTxt(driver);
		
//		Login as another HR head
		String headUsername1 = fLib.getPropertyFileKeyValue("headUsername1");
		String headPassword1 = fLib.getPropertyFileKeyValue("headPassword1");
		String visibleTxt=fLib.getPropertyFileKeyValue("hrHeadVisibleTxt");
		
//		logging to Application
		loginPage.loginToApp(headUsername1, headPassword1, visibleTxt);

//		Thread.sleep(2000);
//		Clicking ok on Alert popup
		wLib.switchToAlertPopupAndAccept(driver, text);
		
//		Verifying the Home page is displaying or not
		homePage.verifyHomePage(driver);

//		Clicking on employeeModuleBtn and addEmployeeBtn
		homePage.getEmployeeModuleBtn();
		
//		entering required Employee in Search bar
		addEmployeePage.searchEmployeeName(comID);

//		this method delete the employee through companyId
		addEmployeePage.deleteEmployeeByCompanyId(driver,comID,fName);

//		clicking ok on delete alert popup
		wLib.switchToAlertPopupAndAccept(driver, text);
		
//		verifying the Employee is deleted or not
		addEmployeePage.verifyEmployeeDeleted(driver, comID);
	}
	
	@Test
	public void testThis() {
		System.out.println("I am very good");
	}

}
