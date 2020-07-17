package org.specifieranother.test;

import org.SpecifiersModifierTest.test.TestA;

public class TestC extends TestA{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//default method cannot be accessed outside of package. It can be accessed only with in the same package
		
		//private method also cannot be accessed outside of package
		
		//protected method can be accessed outside of package only using inheritance. Not by using the object of the same class
		
		//static methods or variables cannot be accessed outside of package. But if it is declared as public it can be accessed
		
		TestC c=new TestC();
		
		c.empAdress();
		c.empName();
	    empEdu();
		//System.out.println(a);
	    
	    TestE et=new TestE();
	    et.interest();
	    et.deposit();
	
		
		

	}

}
