package orrg.collection.test;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer,String> mp=new HashMap();
		mp.put(1,"mary");
		mp.put(2,"John");
		mp.put(3,"stephen");
		
//	Map<String,Integer> mp1=new HashMap();
//	mp1.put("rose",1);
//	System.out.println(mp1.get("rose"));
//	
//	int value=mp1.get("rose");
//	
//	System.out.println("value is"+value);
			
		
			
		
				
		System.out.println("values available in the map are"+mp);
		String a=mp.get(1);
		System.out.println(a);
		
		
		Set<Integer> se=mp.keySet();
		System.out.println("Printing keys only" +se);
		
			
		Collection c=mp.values();
		System.out.println("Printing values only"+c);
		
		int b=mp.size();
			System.out.println("size of map"+b);
			
		boolean d=mp.containsValue("John");
		System.out.println(d);
		
		
		
		Set<Entry<Integer,String>> en=mp.entrySet();
		
		for (Entry<Integer, String> entry : en) {
			
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
		
		
		
		
		
	}

}
