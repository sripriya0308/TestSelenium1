package org.ControlStatements.test;

public class StaticVar {

	
		public static int j;
		
    public void test() {
			
			j=30;
			
			//System.out.println(j);
		}
		
		public void testNew() {
			
			System.out.println(j);
		}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
StaticVar iv=new StaticVar();
		
		System.out.println("value before initialization");
		System.out.println(j);
		iv.test();
		
		System.out.println("value after initialization");
		System.out.println(j);
		
		
		//InstanceVar iv1=new InstanceVar();
		//accessing j value with different object-no need as j is static it can be accessed directly
		//StaticVar iv1=new StaticVar();
		//System.out.println(j);
		
		

	}

}
