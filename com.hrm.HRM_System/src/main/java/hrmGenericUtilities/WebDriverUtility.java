package hrmGenericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Text;

/**
 * This class consists of all Webdriver related methods
 * 
 * @author Pavan
 *
 */
public class WebDriverUtility {

	public WebDriver getRequiredBrowser(String browser) {
		WebDriver driver;
		ChromeOptions op=new ChromeOptions();
		op.addArguments("headless");
		if(browser.contains("Chrome")) {
			driver=new ChromeDriver();
			return driver;
		}
		else if(browser.contains("Firefox")) {
			driver=new FirefoxDriver();
			return driver;
		}
		else if(browser.contains("edge")) {
			driver=new EdgeDriver();
			return driver;
		}
		else {
			driver=new ChromeDriver();
			return driver;
		}
	}
	
	
	/**
	 * This method is used to maximize the Browser window
	 * 
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * This method is used to minimize the Browser window
	 * 
	 * @param driver
	 */
	public void minimizeWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}

	/**
	 * This method used to minimize the Browser window
	 * 
	 * @param driver
	 */
	public void waitTillPageGetsLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IPathConstant.explicitWaitDuration));

	}

	/**
	 * This method wait until element is visible
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitTillElementToBeVisible(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IPathConstant.explicitWaitDuration));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * This method wait until element to be clickable
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitTillElementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IPathConstant.explicitWaitDuration));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * This method wait until alert to present in UI
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitForAlertPopup(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IPathConstant.explicitWaitDuration));
	}

	/**
	 * This method wait until title to be visible in webpage
	 * 
	 * @param driver
	 * @param title
	 */
	public void waitForATitle(WebDriver driver, String title) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IPathConstant.explicitWaitDuration));
		wait.until(ExpectedConditions.titleContains(title));
	}

	/**
	 * This method wait until url to be visible in webpage
	 * 
	 * @param driver
	 * @param url
	 */
	public void waitForAUrl(WebDriver driver, String url) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IPathConstant.explicitWaitDuration));
		wait.until(ExpectedConditions.urlContains(url));
	}

	/**
	 * This method ignore NoSuchElementException
	 * 
	 * @param driver
	 */
	public void ignoreNoSuchEleException(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IPathConstant.explicitWaitDuration));
		wait.ignoring(NoSuchElementException.class);
	}

	/**
	 * This method select the element from dropdown menu by Index
	 * 
	 * @param element
	 * @param index
	 */
	public void selectElementInDropDown(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	/**
	 * This method select the element from dropdown menu by Value
	 * 
	 * @param element
	 * @param value   These select class method are the Example of Method overloadig
	 *                in our framework
	 */
	public void selectElementInDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	/**
	 * This method select the element from dropdown menu by Value
	 * 
	 * @param text
	 * @param element
	 */
	public void selectElementInDropDown(String text, WebElement element) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	/**
	 * This method will fetch all the options present in the dropdown
	 * 
	 * @param element
	 */
	public void getAllOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (WebElement op : options) {
			String text = op.getText();
			System.out.println(text);
		}

	}

	/**
	 * This method is used to move the mover over the element
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseOverOnElement(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	/**
	 * This method is used to right click on the element
	 * 
	 * @param driver
	 * @param element
	 */
	public void rightClickOnElement(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}

	/**
	 * This method is used to double click on the element
	 * 
	 * @param driver
	 * @param element
	 */
	public void doubleClickOnElement(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

	/**
	 * This method is used to drag the element from one place to another place
	 * 
	 * @param driver
	 * @param src
	 * @param dest
	 */
	public void dragAndDropOfElement(WebDriver driver, WebElement src, WebElement dest) {
		Actions action = new Actions(driver);
		action.dragAndDrop(src, dest).perform();
	}

	/**
	 * This method is used to switch frame based on the index
	 * 
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * This method is used to switch frame based on the id
	 * 
	 * @param driver
	 * @param id
	 */
	public void switchToFrame(WebDriver driver, String id) {
		driver.switchTo().frame(id);
	}

	/**
	 * This method is used to switch frame based on WebElement
	 * 
	 * @param driver
	 * @param element
	 */
	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	/**
	 * This method is used to switch to the main frame of the Webpage
	 * 
	 * @param driver
	 */
	public void switchToFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	/**
	 * This method is used to switch to alert popup and click on accept
	 * 
	 * @param driver
	 * @param text
	 */
	public void switchToAlertPopupAndAccept(WebDriver driver, String text) {
		waitForAlertPopup(driver, null);
		Alert alt = driver.switchTo().alert();
		if (alt.getText().trim().contains(text.trim())) {
			System.out.println("Alert is present");
		} else
			System.out.println("Alert is not present");
		alt.accept();
	}
	
	public void switchToAlertPopupAcceptAndPrintTxt(WebDriver driver) {
		String txt=driver.switchTo().alert().getText();
		System.out.println(txt);
		driver.switchTo().alert().accept();
	}
	
	public void switchToAlertPopupAndAccept1(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	

	/**
	 * This method is used to switch to alert popup and click on dismiss
	 * 
	 * @param driver
	 * @param text
	 */
	public void switchToAlertPopupAndDismiss(WebDriver driver, String text) {
		Alert alt = driver.switchTo().alert();
		if (alt.getText().trim().equalsIgnoreCase(text.trim())) {
			System.out.println("Alert is presnt");
		} else
			System.out.println("Alert is not present");
		alt.dismiss();
	}

	/**
	 * this method is used to handle fileUpload popup
	 * 
	 * @param element
	 * @param rPath
	 */
	public void fileUploadPopup(WebElement element, String rPath) {
		File file = new File(rPath);
		String aPath = file.getAbsolutePath();
		element.sendKeys(aPath);
	}
	/**
	 * this method is used to provide user own polloing time
	 * @param duration
	 * @param element
	 * @param polloingTime
	 */
	public void customeWait(int duration, WebElement element, long polloingTime) {
		int count = 0;
		while (count < duration) {
			try {
				element.click();
				break;
			} catch (Exception e) {
				try {
					Thread.sleep(polloingTime);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				count++;

			}
		}
	}
	
	/**
	 * This method is used to get screenShots
	 * @param driver
	 * @param screenShotName
	 * @return
	 * @throws IOException
	 */
	public String takeScreenShot(WebDriver driver,String screenShotName) throws Throwable {
		TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
		File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
		LocalDateTime localDateTime=LocalDateTime.now();
		String dateA=localDateTime.toString().replace(" ","_").replace(".","_").replace(":","_");
		File dest=new File("./screenShots/"+screenShotName+""+dateA+".png");
		FileUtils.copyFile(src, dest);
		return screenShotName;
	}

	
	
	

}
