package SDET48;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxK {

	@Test
	public void testFir() {
		WebDriver dr=new FirefoxDriver();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get("https://www.amazon.in/");
		dr.findElement(By.id("twotabsearchtextbox")).sendKeys("Protien");
		dr.findElement(By.id("nav-search-submit-button")).click();
	}
}
