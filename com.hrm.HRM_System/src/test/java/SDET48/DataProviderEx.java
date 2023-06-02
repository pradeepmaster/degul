package SDET48;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
	@Test(dataProvider = "data4X4")
	public void print(String from,String to,String rs,String co) {
		System.out.println("From-->"+from+" To--->"+to+" RS---->"+rs+" CO--->"+co);
	}
	
	@DataProvider
	public Object[][] data4X4() {
	Object[][] ob=new String[4][4];
	
	ob[0][0]="Bangalore";
	ob[0][1]="Udupi";
	ob[0][2]="450";
	ob[0][3]="450";
	
	ob[1][0]="Bangalore";
	ob[1][1]="Jahanadad";
	ob[1][2]="1350";
	ob[1][3]="1350";
	
	ob[2][0]="Bangalore";
	ob[2][1]="Modya";
	ob[2][2]="350";
	ob[2][3]="350";
	
	ob[3][0]="Bangalore";
	ob[3][1]="Bijapur";
	ob[3][2]="750";
	ob[3][3]="750";
	return ob;
	}
	
	
////	@DataProvider
//	Public Object[][] data3X3() {
//		Object[][] ob1=new Object[3][3];
//	}
	
	
	
	
}
