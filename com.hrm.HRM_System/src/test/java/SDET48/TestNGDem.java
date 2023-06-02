package SDET48;

import org.testng.annotations.Test;

public class TestNGDem {

	@Test()
	public void Aysore() {
		System.out.println("Mysore palace");
	}
	
	@Test(dependsOnMethods="Dangalore",groups="smokeTest")
	public void CharKhand() {
		System.out.println("Coal");
	}
	
	@Test
	public void Dangalore() {
		System.out.println("Wonderla");
	}
	
	@Test(groups="smokeTest")
	public void Bo() {
		System.out.println("Fail");
	}
	
	@Test
	public void Ele() {
		System.out.println("Pradeep");
	}
}
