package org.ControlStatements.test;

public class NestedIfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int a=10;
		//int a=9;
		int b=19;
		
		if(a==10) {
			if(b==20) {
				System.out.println("b value is correct");
			}
			
			System.out.println("a value is correct");
		}
		
		else {
			System.out.println(" both a and b values are incorrect");
		}
	}

}
