package org.test.practice;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ExerciseSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<Integer>  al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(90);
		al.add(10);
		al.add(10);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		
		int length=al.size();
		System.out.println("length of array list is" + length);
		
		int index=al.indexOf(10);
		System.out.println("index of 10 is"+index);
		
		System.out.println("value present at fourth index"+al.get(4));
		
		
		List<Integer>  alnew=new ArrayList<Integer>();
		alnew.add(10);
		alnew.add(30);
		alnew.add(90);
		
		
		
		
		
		
		
		for(int i=0;i<length;i++) {
			
			System.out.println(al.get(i));
		}
		al.remove(5);
		System.out.println("new arraylist is"+al);
		
		al.retainAll(alnew);
		System.out.println("new arraylist"+alnew);
		
		
	//////////////////////////////////////////////////////////
		
		
		List<Integer>  ll=new LinkedList<Integer>();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add(500);
		ll.add(500);
		ll.add(700);
		
		System.out.println(ll);
		
		System.out.println("length of linkede list is"+ ll.size());
		
		int ind=ll.lastIndexOf(700);
		System.out.println("index of last value is"+ind);
		
		System.out.println("value present at second index"+ll.get(2));
		ll.add(2, 50);
		
		for(int i:ll) {
			
			System.out.println(i);
		}
		
		
		////////////////////////////////////////////////////////////
		
		List<Integer>  vl=new Vector<Integer>();
		vl.add(105);
		vl.add(205);
		vl.add(305);
		vl.add(405);
		vl.add(405);
		
		System.out.println(vl);
		
		int valuenotpresent=vl.indexOf(104);
		System.out.println("index of value which is not present"+valuenotpresent);
		
		System.out.println("length of vector is"+ vl.size());
		
		System.out.println("value of elemnt present at eighth index"+vl.get(0));
		vl.set(1, 206);
		
		for(int j:vl) {
			
			System.out.println(j);
		}
		
			
	}

}
