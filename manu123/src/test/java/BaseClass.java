


import java.io.IOException;
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

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	
	public WebDriver driver;
	
//		connect to DB
		@BeforeSuite()
		public void connectDB() throws SQLException {
			//dLib.connectToDB();
			System.out.println("-----Connected to DB-----");
		}
		
//		close the DB connection
		@AfterSuite()
		public void closeBD() throws SQLException {
			//dLib.closeDB();
			System.out.println("-----Closed to DB-----");
		}
		
//		Launch the Browser
//		@Parameters("browser")
		@BeforeClass()
		public void BC() throws IOException {
			//String browser=fLib.getPropertyFileKeyValue("browser");
			
			String browser=System.getProperty("browser");
			
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
		@AfterClass()
		public void AC() {
			driver.quit();
			System.out.println("-----Closed the Browser-----");
		}
		
//		Logging to the application as HR Head
		@BeforeMethod()
		public void BM() throws IOException {
			System.out.println("-----Logging to App is completed-----");
		}
		
//		logout from the Application
		@AfterMethod()
		public void AM() {
//			wLib.switchToAlertPopupAcceptAndPrintTxt(driver);
			System.out.println("-----LogOut from App is completed-----");
		}
}
