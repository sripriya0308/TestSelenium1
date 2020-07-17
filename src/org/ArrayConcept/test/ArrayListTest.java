package org.ArrayConcept.test;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List li=new ArrayList();
		li.add(10);
		li.add("mary");
		li.add(true);
		li.add(5678888l);
		System.out.println(li);
		
		//<> is referred to as generics
		//generics can be given in right hand side alos. But it is not necessary
		
		List<Integer> lit =new ArrayList();
		lit.add(10);
		lit.add(20);
		lit.add(30);
		
		
		//just for view purpose we can use sysout to view the items available in the list. Only through for loop we can fetch the items available in the list
		System.out.println(lit);
		
		
		
		Set<Object> se=new LinkedHashSet();
		for(Object l:li) {
			
			se.add(l);
		}
		
		
		System.out.println("set values are"+se);

		
		//shortcut key for storing size value in a variable===ctrl+2+l
		
		int size=li.size();
		System.out.println("size of first list" +size);
		
		int sizenew=lit.size();
		System.out.println("size of second list"+sizenew);
		
		System.out.println(li.get(3));
		
		int index=li.indexOf(10);
		
		System.out.println(index);
		
		int last=lit.lastIndexOf(30);
		System.out.println(last);
		
		boolean m=li.contains("mary");
		System.out.println(m);
		
		boolean n=li.isEmpty();
		System.out.println(n);
		
		System.out.println("Iterating through for loop");
		
		
		for (int i=0;i<size;i++) {
			System.out.println(li.get(i));
		}
		
		System.out.println("iterating through enhanced for loop");
		
		for (Integer h : lit) {
			
			System.out.println(h);
			
		}
		
				
		//to insert a new value at a particular index
		
		lit.add(1,60);
		System.out.println("new list" +lit);
		
		//to replace a value
		
		lit.set(2,70);
		System.out.println("updated list"+lit);
		
		//to remove a particular value based on index
		
		lit.remove(0);
		System.out.println("list afer value removal"+lit);
		
		
		List<Integer> list1=new ArrayList();
		
		list1.add(100);
		list1.add(120);
		list1.add(130);
		list1.add(70);
		list1.add(30);
		list1.add(30);
		
		//list1.clear();----will result in inde out of bound exception
		//System.out.println("after clearing values"+list1);
		
		int k=list1.get(2);
		System.out.println("value of index 2 is "+" "+k);
		
		System.out.println("print the values in list1"+list1);
		
		list1.retainAll(lit);
		System.out.println("print the values in list1 after retainment"+list1);
		
		list1.removeAll(lit);
		System.out.println("after removing all items using another list"+list1);
		
		
			

		
		
		
		
	
		
		
		

	}

}
