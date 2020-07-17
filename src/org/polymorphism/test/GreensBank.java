package org.polymorphism.test;

public class GreensBank extends IciciBank{
	
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("6.5");
	}
	
	public void fixed() {
		// TODO Auto-generated method stub
		
		System.out.println("7.5");

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GreensBank gb=new GreensBank();
		gb.deposit();
		gb.savings();
		gb.fixed();
	}

}
