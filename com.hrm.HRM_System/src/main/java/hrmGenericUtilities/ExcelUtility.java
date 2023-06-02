package hrmGenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

/**
 * This class consists of excel related methods like insert data,fetch data,
 * get RowNumber
 * @author Pavan
 *
 */
public class ExcelUtility {

	/**
	 * This method is use to insert data into excel sheet
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @param data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExcelDate(String sheetName,int rowNum,int cellNum,String data) throws EncryptedDocumentException, IOException {
		FileInputStream fileInputStream=new FileInputStream(IPathConstant.excelPath);
		Workbook workbook=WorkbookFactory.create(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.createRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(data);
		FileOutputStream fileOutputStream=new FileOutputStream(IPathConstant.excelPath);
		workbook.write(fileOutputStream);
		workbook.close();
	}
	
	/**
	 * This method is used to get the data from excel sheet
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return String
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelData(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream fileInputStream=new FileInputStream(IPathConstant.excelPath);
		Workbook workbook=WorkbookFactory.create(fileInputStream);
		Sheet sheet=workbook.getSheet(sheetName);
		Row row=sheet.getRow(rowNum);
		Cell cell=row.getCell(cellNum);
		String value=cell.getStringCellValue();
		return value;
	}
	
	/**
	 * This method is used to get the last rowNum from the excel sheet
	 * @param sheetName
	 * @return int
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public int getRowNumber(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fileInputStream =new FileInputStream(IPathConstant.excelPath);
		Workbook workbook=WorkbookFactory.create(fileInputStream);
		Sheet sheet=workbook.getSheet(sheetName);
		int row=sheet.getLastRowNum();
		return row;
	}
	
	/**
	 * This method get the data from the excel sheet
	 * @param sheetName
	 * @return
	 * @throws Exception
	 */
	@DataProvider
	public Object[][] fetchData() throws Exception{
		FileInputStream fileInputStream=new FileInputStream(IPathConstant.excelPath);
		Workbook workBook=WorkbookFactory.create(fileInputStream);
		Sheet sheet = workBook.getSheet("DataProviderEx");
		int lastRow = sheet.getLastRowNum()+1;
		int lastCell=sheet.getRow(0).getLastCellNum();
		Object[][] stringData=new Object[lastRow][lastCell];
		for(int i=0;i<lastRow;i++) {
			for(int j=0;j<lastCell;j++) {
				stringData[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return stringData;
	}
	
	/**
	 * 
	 * @param sheetName
	 * @return
	 * @throws Exception
	 */
	public HashMap<String, String> getExcelName(String sheetName) throws Exception{
		FileInputStream fileInputStream=new FileInputStream(IPathConstant.excelPath);
		Workbook workbook = WorkbookFactory.create(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		int lastRow = sheet.getLastRowNum()+1;
		HashMap<String, String> hm=new HashMap<String, String>();
		for(int i=0;i<lastRow;i++) {
			String key = sheet.getRow(i).getCell(0).toString();
			String value = sheet.getRow(i).getCell(1).toString();
			hm.put(key, value);
		}
		return hm;
	}
	
}
