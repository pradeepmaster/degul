package com.hrm.HRHead;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import POM.AddAdminPage;
import POM.HomePage;
import POM.LoginPage;
import hrmGenericUtilities.BaseClass;
import hrmGenericUtilities.ExcelUtility;
import hrmGenericUtilities.FileUtility;
import hrmGenericUtilities.JavaUtility;
import hrmGenericUtilities.WebDriverUtility;

public class CreateAdmin extends BaseClass {

		@Test(groups="smokeTest")
		public void createAdmin() throws EncryptedDocumentException, IOException, InterruptedException {
		wLib.switchToAlertPopupAcceptAndPrintTxt(driver);

//		Verifying the Home page is displaying or not
		HomePage homePage=new HomePage(driver);
		homePage.verifyHomePage(driver);

//		Clicking on Admin module in left side Navagation bar
       homePage.getAdminModuleBtn();;

       AddAdminPage addAdminPage=new AddAdminPage(driver);
//		clicking on the Add Admin button in on the RightTop Corner
		addAdminPage.getAddAdminBtn();

//		Filling the required elements in the form
		String sheetName	="addAdmin";
		String companyID 	= eLib.getExcelData(sheetName, 1, 0);
		String firstName 	= eLib.getExcelData(sheetName, 1, 1);
		String lastName 	= eLib.getExcelData(sheetName, 1, 2);
		String middleName	= eLib.getExcelData(sheetName, 1, 3);
		String visibleTxt1	= eLib.getExcelData(sheetName, 1, 4);
		String contactNo	= eLib.getExcelData(sheetName, 1, 5);
		String eMail 		= eLib.getExcelData(sheetName, 1, 6);
		String ePassword 	= eLib.getExcelData(sheetName, 1, 7);
		
//		Filling the from to create a new admin
		addAdminPage.addNewAdminDataAndSave(companyID, firstName, lastName, middleName, contactNo, wLib, visibleTxt1, eMail, ePassword);

//		Clicking ok on Alert popup
		wLib.switchToAlertPopupAcceptAndPrintTxt(driver);

//		Thread.sleep(2000);
//		Selecting the show drop down
		String vText="100";
		addAdminPage.showSelect100(wLib, vText);

//		Thread.sleep(2000);
//		Verifying Company Details Added or Not
		List<WebElement> allCompany = driver.findElements(By.xpath("//td[1]"));
		Iterator<WebElement> al = allCompany.iterator();
		int count = 0;
		while (al.hasNext()) {
			WebElement companyId = al.next();
			String id = companyId.getText();
			if (id.equals(companyID)) {
				System.out.println("sccessufully Added");
				count++;
				break;
			}
		}
		if (count == 0)
			System.err.println("Not Created");

		Thread.sleep(2000);
//		Handing alert popup by clicking ok
//		wLib.switchToAlertPopupAcceptAndPrintTxt(driver);
		}
}
