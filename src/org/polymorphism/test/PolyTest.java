package org.polymorphism.test;

public class PolyTest {
	//Method overloading
	//depends on datatype
	public void empId (int id) {
		System.out.println("Id");
	}
	
	
	public void empId(float sal) {
		System.out.println("sal");
	}

	
	//depends on count of args
	
	public void empId(String name, float sal, long phone, char block) {
		
		System.out.println(name +' '+ sal+ ' '+ phone+' '+block);
		
		
		
	}
	
	//datatype order
	
	public void empId(String name, int id) {
		System.out.println(name+' '+id);
	}
	
	public void empId(int id, String name) {
		
		System.out.println(id+","+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolyTest pt=new PolyTest();
		pt.empId(2345);
		pt.empId(2000f);
		pt.empId("sri",2000f,34533333l,'c');
		pt.empId("priya",7899);
		pt.empId(23111,"krishna");
		
		
		

	}

}
