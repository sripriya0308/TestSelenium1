package org.test.practice;

public class ExcerciseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//to print even number from 1 to 100
		
		
		
		for(int i=1; i<=100;i++) {
			
			i++;
			
			System.out.println(i);
			
		}
		
		//sum of odd number
		
		int sum=0;
		
		for (int k=1;k<=100;k++) {
			
				System.out.println(k);
				sum=sum+k;
				k++;
			
			
			
		}
		System.out.println(sum);
		
		
		
		//count  of even number from 1 to 100
		
		int count=0;
		
		for (int j=1; j<=100;j++) {
			
			j++;
			
			System.out.println(j);
			
			count=count+1;
			
			
		}
		System.out.println(count);
		
		
		//factorial of a number
		
		int factorial=1;
		
		for (int n=1;n<=5;n++) {
			
			factorial= factorial *n;
			
		}
		
		System.out.println(factorial);
		
		
		//fibonacci series
		
		int nos=5;
		int z=0;
		int x=1;
		
		
		
		for (int y=0;y<=nos;y++)
			
		{
						
			System.out.println(z);
			int total=z+x;
			z=x;
			x=total;
			
				
				
			}
			
			
			
		
		
		
		

	}

}
