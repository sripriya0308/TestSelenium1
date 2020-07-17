package org.test.practice;


import java.util.Scanner;

public class ExceptionCheckUsingThows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		try {
			throw new UserDefinedExceptionTest();
		} catch (UserDefinedExceptionTest e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}


 class ExceptionTestThrows{
	 
	 public static void main(String[] args) throws UserDefinedExceptionTest  {
	 
	 Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id");
		String empId=sc.next();
		
		
		
		if(empId.startsWith("U")){
			
			
			System.out.println("valid employee id");
		}
		
		else {
		throw new UserDefinedExceptionTest();
		
		}
	
	
	
	
	
}
	 
 }
