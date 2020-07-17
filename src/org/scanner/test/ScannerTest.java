package org.scanner.test;

import java.util.Scanner;

import org.test.practice.ExceptionCheckUsingThows;
import org.test.practice.TestInterface;


public class ScannerTest  extends  ExceptionCheckUsingThows implements TestInterface  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter id");
		int empId=sc.nextInt();
		System.out.println("Employee id is" +' '+ empId);
		
		System.out.println("Enter name");
		sc.nextLine();
		String name= sc.nextLine();
		System.out.println("Name is"+' '+ name);

	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

}
