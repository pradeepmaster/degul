package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomcla 
{
@FindBy(id="searchDropDownBox")private WebElement searchdropdown;

@FindBy(id="towTabSearchtextbox")private WebElement searchtextbox;

@FindBy(xpath="//input[contains(@id,'submit-button')]")private WebElement searchbutton;

public WebElement getSearchdropdown() {
	return searchdropdown;
}

public void setSearchdropdown(WebElement searchdropdown) {
	this.searchdropdown = searchdropdown;
}

public WebElement getSearchtextbox() {
	return searchtextbox;
}

public void setSearchtextbox(WebElement searchtextbox) {
	this.searchtextbox = searchtextbox;
}

public WebElement getSearchbutton() {
	return searchbutton;
}

public void setSearchbutton(WebElement searchbutton) {
	this.searchbutton = searchbutton;
}

public Pomcla(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
