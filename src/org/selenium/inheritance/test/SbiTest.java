package org.selenium.inheritance.test;

public class SbiTest extends RbiTest{
	
	//Hierarchichal inheritance
	
	public void sbiName() {
		System.out.println("sbi name");
	}
	
	public static void main(String[] args) {
		
		SbiTest sb=new SbiTest();
		sb.address();
		sb.sbiName();
	}

}
