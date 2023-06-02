package SDET48;

import org.testng.annotations.Test;

public class TestNGD123 {
	
	@Test
	public void A() {
		System.out.println("A");
	}
	
	@Test(groups="smokeTest")
	public void b() {
		System.out.println("b");
	}
	
	@Test
	public void c() {
		System.out.println("c");
	}
	
	@Test(dependsOnMethods="b",groups="smokeTest")
	public void D() {
		System.out.println("D");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
