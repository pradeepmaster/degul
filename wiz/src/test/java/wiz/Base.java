package wiz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Base 

{
@Test
public void tes()
{
	WebDriver dr;
	
	String BRO=System.getProperty("browser");
	String u=System.getProperty("url");
	
	
	if(BRO.equalsIgnoreCase("edge"))
	{
		dr=new EdgeDriver();
		
	}
	else 
	{
		dr=new FirefoxDriver();
	}
	dr.get(u);
	System.out.println("ALL CLEAR");
}
}
