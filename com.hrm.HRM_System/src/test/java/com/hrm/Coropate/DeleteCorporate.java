package com.hrm.Coropate;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM.AddAdminPage;
import POM.AddCorporatePage;
import POM.AddEmployeePage;
import POM.HomePage;
import POM.LoginPage;
import hrmGenericUtilities.BaseClass;
import hrmGenericUtilities.ExcelUtility;
import hrmGenericUtilities.FileUtility;
import hrmGenericUtilities.JavaUtility;
import hrmGenericUtilities.RetryAnalyzer;
import hrmGenericUtilities.WebDriverUtility;
@Listeners(hrmGenericUtilities.ListenerImplement.class)
public class DeleteCorporate extends BaseClass {

	@Test(groups="smokeTest",retryAnalyzer = RetryAnalyzer.class)
	public void deleteCorporate() throws InterruptedException, IOException {
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		AddCorporatePage addCorporatePage = new AddCorporatePage(driver);
		String text = "su";

		wLib.switchToAlertPopupAcceptAndPrintTxt(driver);

//		Verifying the Home page is displaying or not
		homePage.verifyHomePage(driver);

//		Assert.fail();
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

//		logging as another hr head and delete the created corporate
		String headUsername1 = fLib.getPropertyFileKeyValue("headUsername1");
		String headPassword1 = fLib.getPropertyFileKeyValue("headPassword1");
		String visibleTxt = fLib.getPropertyFileKeyValue("hrHeadVisibleTxt");

//		logging to the application
		loginPage.loginToApp(headUsername1, headPassword1, visibleTxt);

		Thread.sleep(2000);
		wLib.waitForAlertPopup(driver, null);
//		print the text and accept the alert popup
		wLib.switchToAlertPopupAcceptAndPrintTxt(driver);

//		clicking on the Add Corporate Button
		homePage.getCorporateModuleBtn();

		addCorporatePage.deleteCorporate(wLib, driver, corporateName);

//		print the text from alert popup and accept
		wLib.switchToAlertPopupAcceptAndPrintTxt(driver);

//		logging out from the application
		homePage.logOutFromApp();

//		print the text from alert popup and accept
		wLib.switchToAlertPopupAcceptAndPrintTxt(driver);
	}

}
