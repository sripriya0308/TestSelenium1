package org.ControlStatements.test;

public class InstanceVar {
	
	
	// instance variable
		
		int j;
		
		public void test() {
			
			j=20;
			
			//System.out.println(j);
		}
		
		public void testNew() {
			
			System.out.println(j);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVar iv=new InstanceVar();
		
		System.out.println("value before initialization");
		System.out.println(iv.j);
		iv.test();
		
		System.out.println("value after initialization");
		System.out.println(iv.j);
		
		
		InstanceVar iv1=new InstanceVar();
		//accessing j value with different object
		System.out.println(iv1.j);
		System.out.println(StaticVar.j);

	}

}
