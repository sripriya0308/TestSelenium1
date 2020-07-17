package org.selenium.inheritance.test;

public class ClientTest extends CompanyTest{
	
	//Multilevel Inheritance
	
	public void clientId() {
	// TODO Auto-generated method stub
	
	System.out.println("clientid");

}

public void clientName() {
	// TODO Auto-generated method stub
	System.out.println("clientname");

}

public static void main (String[] args) {
	
	ClientTest cl=new ClientTest();
	cl.clientId();
	cl.clientName();
	cl.compId();
	cl.compName();
	cl.empId();
	cl.empName();
}

	
	

}
