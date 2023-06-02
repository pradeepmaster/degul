package com.hrm.HRHead;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.checkerframework.checker.fenum.qual.SwingTextOrientation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import hrmGenericUtilities.ExcelUtility;
import hrmGenericUtilities.IPathConstant;

public class UsingDataProvider {

	public void createNewAdmin(HashMap<String,String> data,WebDriver driver) {
		for(Entry<String, String> al:data.entrySet()) {
			driver.findElement(By.name(al.getKey())).sendKeys(al.getValue());
		}
	}
	
	
	
}
