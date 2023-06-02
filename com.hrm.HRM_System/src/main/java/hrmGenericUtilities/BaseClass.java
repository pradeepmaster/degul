
package hrmGenericUtilities;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.mysql.cj.jdbc.Driver;

import POM.HomePage;
import POM.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	public	ExcelUtility eLib=new ExcelUtility();
	public	FileUtility fLib=new FileUtility();
	public	JavaUtility jLib=new JavaUtility();
	public	WebDriverUtility wLib=new WebDriverUtility();
	public DataBaseUtility dLib=new DataBaseUtility();
	public WebDriver driver;
	public static WebDriver lDriver;
	
//		connect to DB
		@BeforeSuite(groups= {"smokeTest","regressionTest"})
		public void connectDB() throws SQLException {
			dLib.connectToDB();
			System.out.println("-----Connected to DB-----");
		}
		
//		close the DB connection
		@AfterSuite(groups= {"smokeTest","regressionTest"})
		public void closeBD() throws SQLException {
			dLib.closeDB();
			System.out.println("-----Closed to DB-----");
		}
		
//		Launch the Browser
//		@Parameters("browser")
		@BeforeClass(groups= {"smokeTest","regressionTest"})
		public void BC() throws IOException {
			String browser=fLib.getPropertyFileKeyValue("browser");
			if(browser.equalsIgnoreCase("Chrome")) 
				driver=new ChromeDriver();
			 if(browser.equalsIgnoreCase("Firefox")) {
				 WebDriverManager.firefoxdriver().setup();
				 driver=new FirefoxDriver();
			 }
			 if(browser.equalsIgnoreCase("edge")) 
				driver=new EdgeDriver();
			else 
				driver=new ChromeDriver();
			System.out.println("-----Launched the Browser-----");
		}
		
//		close the browser
		@AfterClass(groups= {"smokeTest","regressionTest"})
		public void AC() {
			driver.quit();
			System.out.println("-----Closed the Browser-----");
		}
		
//		Logging to the application as HR Head
		@BeforeMethod(groups= {"smokeTest","regressionTest"})
		public void BM() throws IOException {
			String url=fLib.getPropertyFileKeyValue("url");
			String headUsername=fLib.getPropertyFileKeyValue("headUsername");
			String headPassword=fLib.getPropertyFileKeyValue("headPassword");
			String hrHeadVisibleTxt=fLib.getPropertyFileKeyValue("hrHeadVisibleTxt");
			driver.get(url);
			lDriver=driver;
//			maximize the window
			wLib.maximizeWindow(driver);
//			implicitly wait for period of 10seconds
			wLib.waitTillPageGetsLoad(driver);
			LoginPage loginPage=new LoginPage(driver);
			loginPage.loginToApp(headUsername, headPassword, hrHeadVisibleTxt);
			System.out.println("-----Logging to App is completed-----");
		}
		
//		logout from the Application
		@AfterMethod(groups= {"smokeTest","regressionTest"})
		public void AM() {
			HomePage homePage=new HomePage(driver);
			homePage.logOutFromApp();
//			wLib.switchToAlertPopupAcceptAndPrintTxt(driver);
			System.out.println("-----LogOut from App is completed-----");
		}
}
