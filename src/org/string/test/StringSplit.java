package org.string.test;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a="Java class Java new program Java";
		
//		String [] d= {"java","test"};
//		int dlen=d.length;
		
		char ch=a.charAt(0);
		
		System.out.println(ch);
		int in=a.indexOf("new");
		System.out.println(in);
		int li=a.lastIndexOf('a');
		System.out.println(li);
		int le=a.length();
		System.out.println(le);
		String lc=a.toLowerCase();
		System.out.println(lc);
		String uc=a.toUpperCase();
		System.out.println(uc);
		boolean bc=a.contains("new");
		System.out.println(bc);
		boolean em=a.isEmpty();
		System.out.println(em);
		boolean sw=a.startsWith("J");
		System.out.println(sw);
		boolean ew=a.endsWith("a");
		System.out.println(ew);
		String tr=a.trim();
		System.out.println(tr);
		String re=a.replace('a', 'b');
		System.out.println(re);
		String ra=a.replaceAll("Java class Java new program Java", "new");
		System.out.println(ra);
		String co=a.concat(ra);
		System.out.println(co);
		int ct=a.compareTo(ra);
		System.out.println(ct);
		boolean ig=lc.equalsIgnoreCase(uc);
		System.out.println(ig);
		
		
		
		String[] b=a.split("");
		String[] c=a.split(" ");
		
		
		for (int i=0;i<c.length;i++) {
			
			System.out.println("values splitted without space"+c[i]);
		}
		
	
	
	
	Map<String,Integer> mp=new LinkedHashMap();
	
		

	/*for (int i = 0; i < c.length; i++) {
		String str=c[i];
				
		if(mp.containsKey(str)) {
			
			Integer j=mp.get(str);
			mp.put(str, j+1);
			
		}
		
		else {
			
			mp.put(str,1);
			System.out.println(mp);
		}
	}
	
	System.out.println(mp);*/
	
	int y=0;
	
	
	for(String m:c) {
		
		
		
		Integer count=mp.get(m);
		if(count==null) {
			
			mp.put(m, 1);
		}
		
		else {
			
			mp.put(m, ++count);
		}
	}
	
	System.out.println(mp);
	
	
	
			
		
		
		
	}
	
	
	
	
 
	
	

	

}
