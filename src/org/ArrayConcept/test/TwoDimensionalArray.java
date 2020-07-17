package org.ArrayConcept.test;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[][]=new int[2][3];
		
		a[0][1]=20;
		a[0][0]=10;
		a[0][2]=30;
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
		
		int len=a.length;
		
		System.out.println(len);
		
		
		for (int i=0;i<2;i++) {
			
			for (int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println(" ");//with space
		}
		

	}

}
