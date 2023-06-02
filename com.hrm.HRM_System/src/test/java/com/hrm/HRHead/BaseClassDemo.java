package com.hrm.HRHead;

import org.testng.annotations.Test;

import hrmGenericUtilities.BaseClass;

public class BaseClassDemo extends BaseClass{

	@Test
	public void createAdmin() {
		wLib.switchToAlertPopupAcceptAndPrintTxt(driver);
		System.out.println("-----Admin Created-----");
	}
}
