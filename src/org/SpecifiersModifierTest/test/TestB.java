package org.SpecifiersModifierTest.test;

public class TestB extends TestA {
	
	//final methods cannot be overridden
	
	public void empColg() {
		System.out.println("empdetails");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//private method cannot be called here using both extends and object creation of the same class
		
		//default method can be accessed here
		
		TestB bt=new TestB();
		bt.empAdress();
		bt.empId();
		bt.empName();
		empEdu();
		empcolg();
		System.out.println(a);
		System.out.println(bt.b);

	}

}
