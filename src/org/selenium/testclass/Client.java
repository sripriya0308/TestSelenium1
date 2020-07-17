package org.selenium.testclass;

import org.selenium.test.classmethods.Customer;
import org.selenium.test.classmethods.Employee;

public class Client {
	private void clientId() {
		// TODO Auto-generated method stub
		
		System.out.println("clientid");

	}
	
	private void clientName() {
		// TODO Auto-generated method stub
		System.out.println("clientname");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client cl=new Client();
		cl.clientId();
		cl.clientName();
		
		Employee e=new Employee();
		e.empId();
		e.empName();
		
		Customer c=new Customer();
		c.custId();
		c.custName();
		

	}

}
