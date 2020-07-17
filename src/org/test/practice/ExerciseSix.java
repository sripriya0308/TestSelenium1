package org.test.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ExerciseSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]=new int[5];
		int[] b=new int[6];
		int sz=b.length;
		int c[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		float avg;
		int size=c.length;
		
		
		int j=0;
		
		
		for (int i = 0; i < size; i++) {
			
		 sum=sum+c[i];
		 
			
		}
		System.out.println("value of sum is" +sum);
			
			avg=sum/size;
			System.out.println("average vlue is"+avg);
			
			
			b[0]=10;
			b[1]=20;
			b[2]=10;
			b[3]=70;
			b[4]=40;
			b[5]=40;
			
			Arrays.sort(b);
			
			for (int i : b) {
				
				System.out.println(i);
				
			}
			// converting array to list
			
			List<Integer> li=new ArrayList<Integer>();
			//for(int i=0;i<sz;i++) {
				//li.add(b[i]);
				
			//}
			//System.out.println(li);
			
			//for(int i:b) {
				//li.add(i);
			//}
			
			//System.out.println(li);

			
			
			int temp[]=new int[sz];
			
			for (int i = 0; i < sz-1; i++) {
				
				if(b[i]!=b[i+1]) {
					
					temp[j++]=b[i];
				}
				
			}
			
			temp[j++]=b[sz-1];
			
			for (int k = 0; k < j; k++) {
				
				System.out.println(temp[k]);
				
			}
				
				
			
			
			
			
			
			
		
		
		

			
	}

	

}
