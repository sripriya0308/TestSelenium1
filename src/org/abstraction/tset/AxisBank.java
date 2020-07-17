package org.abstraction.tset;

public class AxisBank implements SbiBank,YesBank  {
	
	//fully abstraction
	
	//multiple inheritance is achievable through interface
	
	
	

	
	@Override
	public void savings() {
		System.out.println("5%");
		
	}

	@Override
	public void fixed() {
		System.out.println("6%");
		
	}

	@Override
	public void deposit() {
	System.out.println("6.5%");
		
	}

	@Override
	public void current() {
		System.out.println("7.5%");
		
	}
	
	
	@Override
	public void bankName() {
		System.out.println("Yes bank");
		
	}

	@Override
	public void bankAdress() {
		System.out.println("24 street,nungambakkam");
		
	}

	public static void main(String[] args) {
		AxisBank ax=new AxisBank();
		ax.current();
		ax.deposit();
		ax.fixed();
		ax.savings();
		ax.bankAdress();
		ax.bankName();
		
		System.out.println("Git hub testing");
		
		
	}

	

}
