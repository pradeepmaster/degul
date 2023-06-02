package SDET48;

import org.testng.annotations.Test;

public class PrintTheDataProvider {

	@Test(dataProvider = "data4X4",dataProviderClass = DataProviderEx.class)
	public void run(String from,String to,String rs,String co) {
		System.out.println("From ---->"+from+"/t"+" To---->"+to+"/t"+" RS--->"+rs+"/t"+" Co---->"+co);
	}
	
}
