package org.ArrayConcept.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[6];
		
		int b[]=new int[4];
		
		
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		//array will allow duplicate value
		a[2]=70;
		
		b[0]=2;
		b[1]=3;
		b[2]=4;
		
		
		System.out.println("value of a[5]" + a[5]);
		
		int len=a.length;
		
		System.out.println("length of the array");
		System.out.println(len);
		
		//normal for loop
		
		System.out.println("printing values using for loop");
		for (int i=0; i<len;i++)
		{
			
			System.out.println(a[i]);
		}
		
		
		//enhanced for loop
		
		System.out.println("printing values through ehanced for loop");
		
		for (int x : a) {
			
					
			System.out.println(x);
			
		}
		
		//if no values is assigned for any index, defaut value will be printed ie for int '0'	
		
		for (int y : b) {
			System.out.println(y);
		}
		
		Integer[] iArray = Arrays.stream(a).boxed().toArray(Integer[]::new);
		
		List li=new ArrayList();
		Collections.addAll(li, iArray);
		System.out.println(li);
		
		


	}

}
