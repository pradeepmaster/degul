package SDET48;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.DriverManager;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonAllLinks {
	public static void main(String[] args) throws Throwable {
		
//		Hi pradeep
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notification");
		op.addArguments("headless");
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
//		driver.close();
		FileInputStream fis=new FileInputStream("./src\\test\\resources\\data\\testdata1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("sheet1");
		int lastRow = sheet.getLastRowNum();
		for(int i=0;i<allLinks.size();i++) {
		String data=allLinks.get(i).getAttribute("href");	
		Row row = sheet.createRow(i);
		Cell cell = row.createCell(0);
		cell.setCellValue(data);
		}
		FileOutputStream fos=new FileOutputStream("./src\\\\test\\\\resources\\\\data\\\\testdata1.xlsx");
		wb.write(fos);
		wb.close();
		System.out.println("Seccessfully added");
		
		for(int i=0;i<lastRow;i++) {
			String data=wb.getSheet("sheet1").getRow(i).getCell(0).getStringCellValue();
			System.out.println(i+1+"  "+data);
		}
	}
}
