package org.test.practice;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExerciseFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> se=new HashSet<Integer>();
		se.add(10);
		se.add(20);
		se.add(30);
		se.add(10);
		se.add(20);
		
		System.out.println(se);
		
		Set<Integer> se1=new LinkedHashSet<Integer>();
		se1.add(20);
		se1.add(10);
		se1.add(30);
		se1.add(10);
		se1.add(20);
		
		System.out.println(se1);
		
		Set<Integer>  se5=new LinkedHashSet<Integer>();
		se5.add(10);
		se5.add(20);
		se5.add(100);
		
		se1.retainAll(se5);
		System.out.println("common values between se1 and se5 are" +se1);
		System.out.println(se1);
		
		Set<Integer>  se2=new TreeSet<Integer>();
		se2.add(30);
		se2.add(20);
		se2.add(10);
		se2.add(10);
		se2.add(20);
		
		System.out.println(se2);
		
		for (Integer in : se2) {
			
			System.out.println(in);
			
		}
		
		Set<Integer>  se4=new TreeSet<Integer>();
		
		se4.add(100);
		se4.add(200);
		se4.add(300);
		se2.removeAll(se4);
		System.out.println(se2);
		
	se2.retainAll(se4);
	System.out.println("common values between se2 and se4 is "+se2);
	
		
		Set<Integer> se3=new LinkedHashSet<Integer>();
		List<Integer> li=new LinkedList<Integer>();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(100);
		li.add(200);
		
		se3.addAll(li);
		
		System.out.println(se3);
		
		
		
		
		
		

	}

}
