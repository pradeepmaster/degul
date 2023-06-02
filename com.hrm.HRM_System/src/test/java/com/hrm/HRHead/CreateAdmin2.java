package com.hrm.HRHead;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import POM.AddAdminPage;
import POM.HomePage;
import POM.LoginPage;
import hrmGenericUtilities.ExcelUtility;
import hrmGenericUtilities.FileUtility;
import hrmGenericUtilities.JavaUtility;
import hrmGenericUtilities.WebDriverUtility;

public class CreateAdmin2 {

	public static void main(String[] args) throws Throwable {

		ExcelUtility eLib = new ExcelUtility();
		FileUtility fLib = new FileUtility();
		JavaUtility jLib = new JavaUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		
		int ranNum = jLib.getRandomNumber();
//		Opening the Chrome Browser
		WebDriver driver = new ChromeDriver();
		LoginPage loginPage=new LoginPage(driver);
		HomePage homePage=new HomePage(driver);
		AddAdminPage addAdminPage=new AddAdminPage(driver);

//		Virable for handling alert popup
		String text = "Su";

//		Maximize the window
		wLib.maximizeWindow(driver);

//		implicityWait for 15 seconds
		wLib.waitTillPageGetsLoad(driver);

//		URL of the application
		String url = fLib.getPropertyFileKeyValue("url");
		driver.get(url);
		String headUsername = fLib.getPropertyFileKeyValue("headUsername");
		String headPassword = fLib.getPropertyFileKeyValue("headPassword");
		String visibleTxt="→ HR Head";

//		logging to the Application
		loginPage.loginToApp(headUsername, headPassword, visibleTxt);

		Thread.sleep(2000);
//		Clicking ok on Alert popup
		wLib.switchToAlertPopupAndAccept(driver, text);

//		Verifying the Home page is displaying or not
		String aTitle = driver.getTitle();
		if (aTitle.contains("Admin")) {
			System.out.println("Admin page is Displaying");
		} else
			System.err.println("Admin page is not displaying");


//		Clicking on Admin module in left side Navagation bar
       homePage.getAdminModuleBtn();;

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

		UsingDataProvider udp=new UsingDataProvider();
		udp.createNewAdmin(eLib.getExcelName("addAdminDP"), driver);
		
		
		Thread.sleep(2000);
//		Clicking ok on Alert popup
		wLib.switchToAlertPopupAndAccept(driver, "Su");

		Thread.sleep(2000);
//		Selecting the show drop down
		String vText="100";
		addAdminPage.showSelect100(wLib, vText);

		Thread.sleep(2000);
//		Verifying Company Details Added or Not
//		List<WebElement> allCompany = driver.findElements(By.xpath("//td[1]"));
//		Iterator<WebElement> al = allCompany.iterator();
//		int count = 0;
//		while (al.hasNext()) {
//			WebElement companyId = al.next();
//			String id = companyId.getText();
//			if (id.equals(companyID)) {
//				System.out.println("sccessufully Added");
//				count++;
//				break;
//			}
//		}
//		if (count == 0)
//			System.err.println("Not Created");

//		logout from the Application
		homePage.logOutFromApp();

//		Handing alert popup by clicking ok
		wLib.switchToAlertPopupAndAccept(driver, "Su");
	}

}
