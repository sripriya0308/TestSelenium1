package org.test.practice;

public class UserDefinedExceptionTest extends Exception {
	
	
	
	public String getMessage() {
		
		String msg="Employee is not found";
		
		return msg;
		
		
		
	}

}
