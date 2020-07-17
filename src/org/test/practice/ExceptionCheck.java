package org.test.practice;
import java.util.Scanner;

public class ExceptionCheck  {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id");
		String empId=sc.next();
		
		
		
		if(empId.startsWith("U")){
			
			
			System.out.println("valid employee id");
		}
		
		
		else {
			
			try {
				throw new UserDefinedExceptionTest();
			} 
			
			
			
			catch (UserDefinedExceptionTest e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
		
	}

}
