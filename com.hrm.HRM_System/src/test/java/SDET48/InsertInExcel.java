package SDET48;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertInExcel {

	public static void main(String[] args)throws Exception {
		
//		Insert the data into testdata.xlsx
//		FileInputStream fis=new FileInputStream("./src\\test\\resources\\data\\testdata.xlsx");
//		Workbook wb=WorkbookFactory.create(fis);
//		Sheet sheet = wb.getSheet("sheet1");
//		Row row = sheet.createRow(0);
//		Cell cell = row.createCell(1);
//		String insertData="Good";
//		cell.setCellValue(insertData);
//		FileOutputStream fos=new FileOutputStream("./src\\\\test\\\\resources\\\\data\\\\testdata.xlsx");
//		wb.write(fos);
//		wb.close();
//		System.out.println("Insert the data into testdata.xlsx");
	
//		Read the data from testdata.xlsx
		FileInputStream fis=new FileInputStream("./src\\\\test\\\\resources\\\\data\\\\testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data=wb.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data);
	
	
	}

}
