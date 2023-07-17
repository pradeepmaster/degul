package com.hrm.Coropate;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.mysql.cj.result.Row;

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f=new FileInputStream("./SDET47/ex/screen.xlsx");
		Workbook b=WorkbookFactory.create(f);
	Sheet sh=	b.getSheet("Sheet1");
	          org.apache.poi.ss.usermodel.Row r= sh.getRow(0);
	         Cell c=r.getCell(0);
	           
	         String s1=   c.getStringCellValue();
	         System.out.println("s1");

	}

}
