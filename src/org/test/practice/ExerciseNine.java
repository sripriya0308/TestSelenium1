package org.test.practice;

public class ExerciseNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		///////question 1\\\\\\\\\\\
		
		
		String a="Java";
		String b="Java";
		
		boolean c=a.equals(b);
		System.out.println(c);

		String d="Java";
		String e="java";
		
		boolean f=d.equals(e);
		System.out.println(f);
		boolean g=d.equalsIgnoreCase(e);
		System.out.println(g);
		
		String i="Green Technology";
		String j="GreenTechnology";
		
		boolean m=i.equalsIgnoreCase(j);
		System.out.println(m);
		
		///////////////question 2///////////////
		
		String t="priya.saku@yahoo.com";
		boolean r=t.contains("@");
		
		if(r==true) {
			System.out.println("valid email id");
		}
		
		
		
		/////////question 3//////
		
		
		String y="Welcome to java class";
		String z=y.replace(" ", "#");
		System.out.println(z);
		
		//////question 4//////////
		
		String h="Nisha";
		String l=h.toUpperCase();
		System.out.println(l);
		
		//////question 5///////
		
		
		String o="";
		boolean p=o.isEmpty();
		System.out.println(p);
		
	}

}
