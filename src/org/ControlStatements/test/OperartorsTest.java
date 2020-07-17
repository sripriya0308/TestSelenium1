package org.ControlStatements.test;

public class OperartorsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//logical and
		
		int deptid=3456;
		int colgid=8900;
		
		int age=5;
		int height=300;
		
		if((colgid==8900) && (deptid==3457)) {
			
			System.out.println("CSE students from anna university");
			
			
		}
		
		else {
			System.out.println("students from other university");
		}
		
		
		
		
		//bitwise and 
		
       if((colgid==8908) & (deptid==3457)) {
			
			System.out.println("CSE students from anna university");
			
			
		}
		
		else {
			System.out.println("students from other university");
		}


       //logical OR
	
     if(age<=4 || height<=300) {
	
	System.out.println("half ticket");
     }

     else {
	
	System.out.println("full ticket");
     }
		


		
		

	}

}
