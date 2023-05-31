package mavens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditCorpororate {

	public static void main(String[] args) throws InterruptedException 
	
	{

		System.setProperty("webdriver.chrome.driver", "./ps/chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		//entering the url
		dr.get("http://rmgtestingserver/domain/HRM_System/");
		//entering email
		dr.findElement(By.xpath("//input[@type='Email']")).sendKeys("hrhead@gmail.com");
		//entering password
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys("hrhead@123");
		//click on drop down
		dr.findElement(By.xpath("//select[@id='hr_type']")).click();
		//selecting hr head from drop down
		dr.findElement(By.xpath("//option[@value='HR Head']")).click();
		//click on check box
		dr.findElement(By.xpath("//input[@id='remember']")).click();
		//click on sign in button
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		//handling pop up
        Alert al= dr.switchTo().alert();
		al.accept();
		
		//verify home page is displayed

        String ur= dr.getCurrentUrl();
        if(ur.equals("http://rmgtestingserver/domain/HRM_System/Superadmin_Dashboard/Superadmin_Dashboard.php"))
        {
        	System.out.println("home page is displayed");
        }
        else
        {
        	System.out.println("home page is not dispalyed");
        }
		
		//click on add corporate link
	  dr.findElement(By.xpath("(//i[@class='fas fa-angle-left right'])[1]")).click();
	  //click on add corporate check box
	  dr.findElement(By.xpath("(//i[@class='far fa-circle nav-icon'])[1]")).click();
		//click on add corporate button
	  dr.findElement(By.xpath("//button[contains(.,'Add Corporate')]")).click();
	  //enter corporate button
	  dr.findElement(By.xpath("//input[@name='corporate_name' and @placeholder='Corporate Name']")).sendKeys("manudeep8");
	//click on add corporate buttton   
	  dr.findElement(By.xpath("//button[@name='corp']")).click();
	  //handling pop up
	  Alert al2=dr.switchTo().alert();
	  al2.accept();
		//click on profile 
	  dr.findElement(By.xpath("//i[@class='fa fa-user']")).click();
	  //click on logout button
	  dr.findElement(By.xpath("//a[@href='log_out.php']")).click();
	  //handling the pop up
	     Alert al3= dr.switchTo().alert();
			al3.accept();
	  //enter username into text field
	  dr.findElement(By.xpath("//input[@type='Email']")).sendKeys("pra@gmail.com");
		//enter password into text field
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys("pra@123");
		//click on drop down
		dr.findElement(By.xpath("//select[@id='hr_type']")).click();
		//select hr head from drop down
		dr.findElement(By.xpath("//option[@value='HR Head']")).click();
		//select the check box
		dr.findElement(By.xpath("//input[@id='remember']")).click();
		//click on sign in button
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		//handling the pop up
      Alert al4= dr.switchTo().alert();
		al4.accept();
		//click on corporate link
		dr.findElement(By.xpath("(//i[@class='fas fa-angle-left right'])[1]")).click();
		  //click on add corporate check box
		  dr.findElement(By.xpath("(//i[@class='far fa-circle nav-icon'])[1]")).click();
			//passing value to search text field
     dr.findElement(By.xpath("//input[@type='search']")).sendKeys("manudeep8");		
		
     Thread.sleep(2000);
     //click on edit button
     dr.findElement(By.xpath("(//button[@type='button' and text()='Edit'])[1]")).click();
    
     Thread.sleep(3000);
     //clearing the value from text field
     dr.findElement(By.xpath("//div[@class='modal fade show']/div/div/div[2]/input")).clear();
    //entering the new value
     dr.findElement(By.xpath("//div[@class='modal fade show']/div/div/div[2]/input")).sendKeys("manudeep10");
     //clicking on update button
     dr.findElement(By.xpath("//div[@class='modal fade show']/div/div/div[3]/button[2]")).click();
     
     //handling pop up
     Alert al5= dr.switchTo().alert();
		al5.accept();
     
     //verifying whether the corporate is updated
     
     String ur1=dr.getCurrentUrl();
     
     if(ur1.equals("http://rmgtestingserver/domain/HRM_System/Superadmin_Dashboard/Add_corporate.php"))
     {
    	 System.out.println("corporate is updated");
     }
     else
     {
    	 System.out.println("corporate is not updated");
     }
     
     
  
		
     Thread.sleep(2000);
		//click on profile
		 dr.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		  //click on logout 
		  dr.findElement(By.xpath("//a[@href='log_out.php']")).click();
		
		  //handling pop up
		     Alert al6= dr.switchTo().alert();
				al6.accept();
		
	}
}
