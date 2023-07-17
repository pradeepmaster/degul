package hrmGenericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplement implements ITestListener
{
      ExtentReports report;
      ExtentTest test;
	public void onTestStart(ITestResult result)
	{
		String MethodName=result.getMethod().getMethodName();
	ExtentTest test=	report.createTest(MethodName);
		Reporter.log(MethodName+"execution start");
		
	}

	public void onTestSuccess(ITestResult result) 
	{
		String MethodName=result.getMethod().getMethodName();
		test.log(Status.PASS,MethodName+"passed");
		Reporter.log(MethodName );
	}

	public void onTestFailure(ITestResult result) 
	{
//		String testName=result.getMethod().getMethodName();
//		String localDate = LocalDateTime.now().toString().replace(" ","_").replace(":","_");
//		TakesScreenshot takesScreenshot = (TakesScreenshot)BaseClass.lDriver;
//		File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
//		File dst=new File("./screenShots/"+testName+""+localDate+".png");
//		try {
//			FileUtils.copyFile(src, dst);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			WebDriverUtility wlib=new WebDriverUtility();
		String screenshotname=wlib.takeScreenShot(BaseClass.lDriver, result.getMethod().getMethodName());
		test.addScreenCaptureFromPath(screenshotname);
		}catch(Throwable e) {
			e.printStackTrace();
		}
	      test.log(Status.FAIL, result.getThrowable());
	      Reporter.log("script failed");
		
		
	}

	public void onTestSkipped(ITestResult result)
	{
		String MethodName=result.getMethod().getMethodName();
		test.log(Status.SKIP,MethodName);
		test.log(Status.SKIP,result.getThrowable());
		Reporter.log("skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
	}

	public void onTestFailedWithTimeout(ITestResult result) 
	{
		
	}

	public void onStart(ITestContext context) 
	{
		
		ExtentSparkReporter htmlreport=new ExtentSparkReporter("./ExtentReport/report.html");
      htmlreport.config().setDocumentTitle("crm-project");
      htmlreport.config().setTheme(Theme.DARK);
      htmlreport.config().setReportName("hrm");
      
      report=new ExtentReports();
      report.attachReporter(htmlreport);
      report.setSystemInfo("browser", "chrome");
      report.setSystemInfo("os", "windows");
      report.setSystemInfo("url", "https://localhost:8084");
      report.setSystemInfo("reporter name", "pradeep");
      
	}

	public void onFinish(ITestContext context) 
	
	{
		report.flush();
	}
	

}
