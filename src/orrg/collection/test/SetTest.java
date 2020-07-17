
package orrg.collection.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set si=new LinkedHashSet();
		si.add(10);
		si.add(20);
		si.add(30);
		si.add(150);
		si.add(170);
		
		
		System.out.println("values available in set" + si);
		
		
		
		boolean a=si.isEmpty();
		System.out.println(a);
		
		boolean b=si.contains(150);
		System.out.println(b);
		
		int c=si.size();
		System.out.println("size of the set"+c);
		
			
					
		
		
		for (Object s : si) {
			
			System.out.println(s);
			
		}
		
		
		
		
	   Set si1=new HashSet();
	  si1.add("mary");
	  si1.add("john");
	  si1.add("christ");
	   si1.add(170);
	   si1.add(180);
	   
	   
	   System.out.println("vaues available in set2 is"+si1);
	   
	   si.retainAll(si1);
	   System.out.println(si);
	   
	   boolean t=si.contains(170);
	   
	   System.out.println(t);
	   
	   	   
	 //si.clear();
	 //System.out.println("after clearing the set"+si);
	 			   
	   //si.remove(170);
	   
	  // System.out.println(si);
	   
	   //treeset will not allow heterogeneous objects. It will throw classcast exception
	   
	  
	   
	   
	   
		
	
		
		
		
		

	}

}
