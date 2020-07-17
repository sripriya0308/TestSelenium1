package org.selenium.inheritance.test;

public class IndianTest extends RbiTest {

	//Hierarchichal inheritance
	
	public void indianName() {
		System.out.println("Indian bank name");
	}
	
	public static void main(String[] args) {
		IndianTest in=new IndianTest();
		in.address();
		in.indianName();
	}
}
