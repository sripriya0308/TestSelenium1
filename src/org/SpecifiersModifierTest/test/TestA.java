package org.SpecifiersModifierTest.test;

public class TestA extends TestD {
	
	static int a=10;
	 final int b=20;
	
		void empId() {
		System.out.println("value of a is" +" " + a);
		//--here it will be considered as local variable initialization and when this method is called it will print the value of b is 30. In main method, the value of b will be printed as 20
		
		int  b=30;
		//b=30---is not possible as it is declared as final
		System.out.println("value of b is"+b);
		
		
		System.out.println("empId");
	}
	
	@Override
	void savings() {
		// TODO Auto-generated method stub
		
		System.out.println("savings details");
		
	}
	public  static void empEdu() {
		
		System.out.println("emp edu");
	}
	
	 final static void empcolg() {
		
		System.out.println("emp colg");
	}
	
	protected void empName() {
		
		System.out.println("empName");
	}
	
	public void empAdress() {
		
		System.out.println("adress");
	}
	
	private void empPhone() {
		
		System.out.println("empPhone");
	}

	
	public static void main(String[] args) {
		TestA a=new TestA();
		a.empId();
		a.empName();
		a.empPhone();
		a.empAdress();
		empEdu();
		empcolg();
		a.savings();
		
		System.out.println(a.b);
	}

	

	
}
