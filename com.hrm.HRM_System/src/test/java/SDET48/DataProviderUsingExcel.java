package SDET48;

import java.io.FileInputStream;

import org.apache.poi.ss.formula.functions.FinanceLib;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import hrmGenericUtilities.ExcelUtility;
import hrmGenericUtilities.IPathConstant;

public class DataProviderUsingExcel {
	
	@Test(dataProvider="fetchData",dataProviderClass = ExcelUtility.class)
	public void getData(String x,String y,String z) {
		System.out.println(x+"\t"+y+"\t"+z);
	}
	
	
}
