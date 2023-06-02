package SDET48;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CommonClass {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	static WebDriver driver;
	public WebDriver defaultOp(String url) {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notification");
		driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}
	
	public String getTodayDate() {
		Date dat=new Date();
		String[] d=dat.toString().split(" ");
		String day=d[0];
		String mon=d[1];
		String date=d[0];
		String year=d[0];
		return day+" "+mon+" "+date+" "+year;
	}
	
}
