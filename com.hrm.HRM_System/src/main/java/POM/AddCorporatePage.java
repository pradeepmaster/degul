package POM;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hrmGenericUtilities.WebDriverUtility;

public class AddCorporatePage {

	@FindBy(xpath="//input[@type='search']") 
	private WebElement searchTxtBox;
	
	@FindBy(xpath="//select[@aria-controls='example1']")
	private WebElement showDrpDownMenu;
	
	@FindBy(xpath="//button[contains(.,' Add Corporate')]")
	private WebElement addCorporateBtn;
	@FindBy(xpath="//h4[.='Add Corporate']/ancestor::div[@class='modal-content']/descendant::input[@name='corporate_name']")
	private WebElement corporateNameTxtEdt;
	@FindBy(xpath="//h4[.='Add Corporate']/ancestor::div[@class='modal-content']/descendant::button[@name='corp']")
	private WebElement saveBtn;
	@FindBy(xpath="//h4[.='Add Corporate']/ancestor::div[@class='modal-content']/descendant::button[@name='corp']")
	private WebElement closeBtn;
	
	@FindBy(xpath="//label[.='Search:']/input[@aria-controls='example1']")
	private WebElement corporateSearchTxtBox;
	
	
//	initilation
	public AddCorporatePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

//	Business Libraries
	public void searchTxtBar(String name) {
		corporateSearchTxtBox.sendKeys(name);
	}
	
	public void handlingShowDropDown(WebDriverUtility wLib,String visibleTxt) {
		wLib.selectElementInDropDown(visibleTxt, showDrpDownMenu);
	}
	
	public void addCorporateEnterNameAndSave(String corporateName) {
		addCorporateBtn.click();
		corporateNameTxtEdt.sendKeys(corporateName);
		saveBtn.click();
	}
	/**
	 * This method edit the corporate Name and click on update button
	 * @param driver
	 * @param wLib
	 * @param corporateName
	 * @param corporateRename
	 */
	public void editCorporateNameAndSave(WebDriver driver,WebDriverUtility wLib, String corporateName,String corporateRename) {
		corporateSearchTxtBox.sendKeys(corporateName);
//		Clicking on Edit button
		driver.findElement(By.xpath("//td[.='"+corporateName+"']/../descendant::button[.='Edit']")).click();
//		Selecting the edit search box
		driver.findElement(By.xpath("//h4[.='Edit Corporate']/ancestor::div[@class='modal-content']/descendant::input[@name='corporate_name' and @value='"+corporateName+"']")).clear();
		driver.findElement(By.xpath("//h4[.='Edit Corporate']/ancestor::div[@class='modal-content']/descendant::input[@name='corporate_name' and @value='"+corporateName+"']")).sendKeys(corporateRename);
//		clicking on update button
		driver.findElement(By.xpath("//h4[.='Edit Corporate']/ancestor::div[@class='modal-content']/descendant::input[@value='"+corporateName+"']/../following-sibling::div/button[@name='update']")).click();
	
//		clicking on Ok button in alert popup
		wLib.switchToAlertPopupAndAccept(driver,"Su");
		
//		Selecting the show drop down
		String showVisibleTxt="100";
		handlingShowDropDown(wLib, showVisibleTxt);
		
//		verifying the corporate name is updated or not
		List<WebElement> allCoporateName = driver.findElements(By.xpath("//td[2]"));
		Iterator<WebElement>alCN=allCoporateName.iterator();
		int count=0;
		while(alCN.hasNext()) {
			String name=alCN.next().getText();
			if(name.equals(corporateRename)) {
				System.out.println("Coporated Name is Updated Seccessfully");
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("Corporate Name is Not updated");
		}
	}

	/**
	 * This method delete the corporate
	 * @param driver
	 * @param corporateName
	 * @throws InterruptedException 
	 */
	public void deleteCorporate(WebDriverUtility wLib, WebDriver driver,String corporateName) throws InterruptedException {
		wLib.waitForAlertPopup(driver, addCorporateBtn);
//		Searching the required name
		corporateSearchTxtBox.sendKeys(corporateName);
		
//		clicking on delete Btn
		driver.findElement(By.xpath("//td[.='"+corporateName+"']/../descendant::button[.='Delete']")).click();
	
//		Confirming the element by clicking on delete btn
		driver.findElement(By.xpath("//div[@class='modal fade show']/descendant::div[@class='modal-footer justify-content-between']/button[@name='delete']")).click();
	}
	
	
}
