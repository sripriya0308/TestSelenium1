package org.selenium.inheritance.test;

public class AxisTest extends RbiTest {
	
	//Hierarchichal Inheritance
	
	public void axisName() {
		System.out.println("axis bank name");
	}
	
	public static void main(String[] args) {
		
		AxisTest ax=new AxisTest();
		ax.axisName();
		ax.address();
		
	}

}
