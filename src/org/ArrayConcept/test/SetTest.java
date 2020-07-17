package org.ArrayConcept.test;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stubSet
		
		
		Set si=new HashSet();
		si.add(10);
		si.add(20);
		si.add(30);
		si.add(40);
		si.add(50);
		si.add(60);
		System.out.println(si);
		
		int size=si.size();
		System.out.println(size);
		
		//si.clear();
		
		//System.out.println(si);
		
		
		for (Object j : si) {
			
			System.out.println(j);
			
		}

	}

}
