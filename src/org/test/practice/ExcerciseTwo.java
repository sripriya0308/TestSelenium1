package org.test.practice;
import java.util.Scanner;

public class ExcerciseTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Prime number
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		boolean result=false;
		int a=sc.nextInt();
		
		for (int i=2; i<=a;i++) {
			
			if(a%2!=0) {
			
					
								
			if(a%i==0  && a==i) {
				System.out.println(a%i);
				
				result=true;
			
				
			}			
			
				
			
		}
		}
		
		System.out.println(result);
		
		if(!result) 
			
			System.out.println("The given number is not a prime number");
			
				
		
		else
			
			System.out.println("The given number is  a prime number");
		
				
					
				
					
				
			}
		}

		

	


