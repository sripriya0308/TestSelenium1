package orrg.collection.test;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class UserDefinedSet extends EmployeePojo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		UserDefinedSet us=new UserDefinedSet();
		us.setEmpId(1);
		us.setEmpName("mary");
		us.setPhone(988780670l);
		
		UserDefinedSet us1=new UserDefinedSet();
		us1.setEmpId(2);
		us1.setEmpName("John");
		us1.setPhone(9455774534l);
		
		UserDefinedSet us2=new UserDefinedSet();
		us2.setEmpId(3);
		us2.setEmpName("rose");
		us2.setPhone(9008834221l);
		
		
		
		Set<UserDefinedSet> si=new LinkedHashSet();
		si.add(us);
		si.add(us1);
		si.add(us2);
		
		for (UserDefinedSet usd : si) {
			
			System.out.println(usd.getEmpId());
			System.out.println(usd.getEmpName());
			System.out.println(usd.getPhone());
			
		}
		
		
		
		
		
		

	}

}
