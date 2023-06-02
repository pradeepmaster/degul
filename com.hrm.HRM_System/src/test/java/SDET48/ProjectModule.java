package SDET48;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.jdbc.Driver;

public class ProjectModule {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("http://rmgtestingserver:8084/");
		
//		login to application
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		
//		Thread.sleep(3000);
//		
		driver.findElement(By.xpath("//ul[@class='list-unstyled components']/descendant::a[.='Projects']")).click();
		driver.findElement(By.xpath("//span[.='Create Project']")).click();
		driver.findElement(By.name("projectName")).sendKeys("Mohit Panday");
		driver.findElement(By.name("createdBy")).sendKeys("Pavan");
		
		WebElement status=driver.findElement(By.xpath("//label[@class='col-sm-2 col-form-label']/following-sibling::select[@name='status']"));
		Select s=new Select(status);
		s.selectByVisibleText("On Gogin");
		driver.findElement(By.xpath("//input[@value='Add Project']")).submit();
//		driver.findElement(By.xpath("//a[.='Logout']")).click();
//		driver.close();
	
	}

}
