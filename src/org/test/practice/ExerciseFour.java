


package org.test.practice;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ExerciseFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Map<Integer,String> mp=new HashMap<Integer, String>();
		mp.put(10, "java");
		mp.put(20, "sql");
		mp.put(30, "oops");
		mp.put(40, "Sql");
		mp.put(50, "oracle");
		mp.put(60, "db");
		mp.put(70, "selenium");
		mp.put(80, "psql");
		mp.put(90, "hadoop");
		
		System.out.println(mp);
		System.out.println(mp.keySet());
		System.out.println(mp.values());
		
		Set<Entry<Integer,String>> se=mp.entrySet();
		for (Entry<Integer, String> in: se) {
			
			System.out.println(in);
			System.out.println(in.getKey());
			System.out.println(in.getValue());
			
		}
		
		Map<Integer,Integer> mp1=new LinkedHashMap<Integer, Integer>();
		mp1.put(10,10);
		mp1.put(20, 20);
		mp1.put(30,30);
		
		System.out.println(mp1);
		System.out.println(mp1.keySet());
		System.out.println(mp1.values());
		
		Map<String,Integer> mp2=new TreeMap<String, Integer>();
		mp2.put("!",10);
		mp2.put("@",20);
		mp2.put("#",30);
		
		
		
		System.out.println(mp2);
		System.out.println(mp2.keySet());
		System.out.println(mp2.values());
		
		Collection<Integer> c=mp2.values();
		for (Object cl : c) {
			
			System.out.println(cl);
			
		}
		
		
		Map<String,String> mp3=new Hashtable<String, String>();
		mp3. put("vel","selenium");
		mp3.put("Ganesh", "DB");
		mp3.put("Dinesh", "oracle");
		
		System.out.println(mp3);
		
		System.out.println(mp3.keySet());
		
		Set<String>  st=mp3.keySet();
		for (String set : st) {
			
			System.out.println(set);

			
		}
		
		
			
			
		}
		

	

}
