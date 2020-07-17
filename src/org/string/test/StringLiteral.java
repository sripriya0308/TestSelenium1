package org.string.test;

public class StringLiteral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//literal string with duplicates
		String s="manoj";
		String s1="manoj";
		
		
		
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
		//non literal string with duplicates
		
		String x=new String("manoj");
		String x1=new String("manoj");
		
//		x=x.concat(x1);
//		System.out.println("concatenated non string literal"+x);
				
				System.out.println(System.identityHashCode(x));
				System.out.println(System.identityHashCode(x1));
				
				//Immutable string
				String a="manoj";
				String b="vel";
				
				
				String c=a.concat(b);
				System.out.println(c);
				System.out.println(System.identityHashCode(a));
				System.out.println(System.identityHashCode(b));
				System.out.println(System.identityHashCode(c));
				
				
				//Mutable string
				StringBuffer sb=new StringBuffer("manoj");
				StringBuffer sb1=new StringBuffer("vel");
				
				 sb=sb.append(sb1);
				 
				 System.out.println(sb);
				
//				System.out.println(sb2);
				
				System.out.println(System.identityHashCode(sb));
				System.out.println(System.identityHashCode(sb1));
//				System.out.println(System.identityHashCode(sb2));
				
				
				
				
				
				
				
				
				
				
				
	}

}
