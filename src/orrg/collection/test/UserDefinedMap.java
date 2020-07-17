package orrg.collection.test;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefinedMap extends EmployeePojo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		UserDefinedMap um=new UserDefinedMap();
		um.setEmpId(1);
		um.setEmpName("mary");
		um.setPhone(988780670l);
		
		UserDefinedMap um1=new UserDefinedMap();
		um1.setEmpId(2);
		um1.setEmpName("John");
		um1.setPhone(9455774534l);
		
		UserDefinedMap um2=new UserDefinedMap();
		um2.setEmpId(3);
		um2.setEmpName("rose");
		um2.setPhone(9008834221l);
		
		
		Map<Integer,UserDefinedMap> me=new LinkedHashMap();
		me.put(1, um);
		me.put(2, um1);
		me.put(3, um2);
		
		Set<Integer> a=me.keySet();
		System.out.println("print the keys"+a);
		
	
		
		
		Set<Entry<Integer,UserDefinedMap>> ude=me.entrySet();
		
		for (Entry<Integer, UserDefinedMap> emd : ude) {
			
			System.out.println(emd.getKey());
			System.out.println(emd.getValue().getEmpId());
			System.out.println(emd.getValue().getEmpName());
			System.out.println(emd.getValue().getPhone());
			
		}
		
		
		
		

	}

}
