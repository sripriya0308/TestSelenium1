package orrg.collection.test;

import java.util.LinkedList;
import java.util.List;

public class UserDefinedList extends EmployeePojo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		UserDefinedList ud=new UserDefinedList();
		ud.setEmpId(1);
		ud.setEmpName("mary");
		ud.setPhone(988780670l);
		
		UserDefinedList ud1=new UserDefinedList();
		ud1.setEmpId(2);
		ud1.setEmpName("John");
		ud1.setPhone(9455774534l);
		
		UserDefinedList ud2=new UserDefinedList();
		ud2.setEmpId(3);
		ud2.setEmpName("rose");
		ud2.setPhone(9008834221l);
		
		
		
		List<UserDefinedList> li=new LinkedList();
		li.add(ud);
		li.add(ud1);
		li.add(ud2);
		
		//System.out.println("values available in the list"+ li);
		
		
		for (int i = 0; i < li.size(); i++) {
			
			System.out.println(li.get(i).getEmpId());
			System.out.println(li.get(i).getEmpName());
			System.out.println(li.get(i).getPhone());
			
		}
		
		for (UserDefinedList udl : li) {
			
			System.out.println(udl.getEmpId());
			System.out.println(udl.getEmpName());
			System.out.println(udl.getPhone());
			
		}
		
		

	}

}
