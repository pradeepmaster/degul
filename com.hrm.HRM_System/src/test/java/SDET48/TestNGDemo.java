package SDET48;

import org.testng.annotations.Test;

public class TestNGDemo {

	@Test(invocationCount=2)
	public void addAdmin() {
		System.out.println("Admin is created");
	}
	
	@Test(dependsOnMethods="addAdmin")
	public void modifyAdmin() {
		System.out.println("Updated admin");
	}
	
	@Test(dependsOnMethods={"modifyAdmin","addAdmin"})
	public void deleteAdmin() {
		System.out.println("Deleted admin");
	}
}
