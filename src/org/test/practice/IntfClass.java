package org.test.practice;

public class IntfClass implements TestInterface{

	

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
		
		System.out.println("test");
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntfClass inf=new IntfClass();
		inf.test();

	}

}
