package com.hrm.Coropate;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import POM.AddCorporatePage;
import POM.HomePage;
import POM.LoginPage;
import hrmGenericUtilities.BaseClass;
import hrmGenericUtilities.ExcelUtility;
import hrmGenericUtilities.FileUtility;
import hrmGenericUtilities.JavaUtility;
import hrmGenericUtilities.WebDriverUtility;

public class ModifyCorporate extends BaseClass{

	@Test(groups={"smokeTest","regessionText"})
	public void modifyCorporate() throws InterruptedException, EncryptedDocumentException, IOException {
		
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		AddCorporatePage addCorporatePage = new AddCorporatePage(driver);
		String text = "su";

		wLib.switchToAlertPopupAcceptAndPrintTxt(driver);

//		Verifying the Home page is displaying or not
		homePage.verifyHomePage(driver);

//		clicking on the Add Corporate Button
		homePage.getCorporateModuleBtn();

//		adding a new Corporate
		int ranNum = jLib.getRandomNumber();
		String corporateName = "RCB" + ranNum;
		addCorporatePage.addCorporateEnterNameAndSave(corporateName);

//		print the text and accept the alert popup
		wLib.switchToAlertPopupAcceptAndPrintTxt(driver);

//		logging out from application
		homePage.logOutFromApp();

//		print the text and accept the alert popup
		wLib.switchToAlertPopupAcceptAndPrintTxt(driver);

//		Logging Another Hr Head
		String headUsername1=fLib.getPropertyFileKeyValue("headUsername1");
		String headPassword1=fLib.getPropertyFileKeyValue("headPassword1");
		String visibleTxt=fLib.getPropertyFileKeyValue("hrHeadVisibleTxt");
		
		loginPage.loginToApp(headUsername1, headPassword1, visibleTxt);
		
//		clicking ok on alert popup
		wLib.switchToAlertPopupAcceptAndPrintTxt(driver);
		
//		Verifying the Home page is displaying or not
		homePage.verifyHomePage(driver);

//		clicking on the Add Corporate Button
//		WebElement visibleElement = homePage.getCorporateElement();
//		wLib.waitTillElementToBeClickable(driver, visibleElement);
		homePage.getCorporateModuleBtn();
		
//		clicking on Add Corporate button on RightTop corner
		String sheetName="addCorporate";
		String corporateReName=eLib.getExcelData(sheetName,1,0)+ranNum;
		
//		This method edit corporate name and rename the corporateName and save
		addCorporatePage.editCorporateNameAndSave(driver,wLib,corporateName, corporateReName);
	}

}
