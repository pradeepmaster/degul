package com.hrm.Employee;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;
import hrmGenericUtilities.BaseClass;

@Listeners(hrmGenericUtilities.ListenerImplement.class)
public class Samp extends BaseClass
{
@Test
public void goget()
{
	LoginPage loginPage=new LoginPage(driver);
	HomePage homePage=new HomePage(driver);
	Assert.fail();
}
}
