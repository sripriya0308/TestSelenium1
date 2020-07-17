package org.test.practice;

public class ExecerciseThree {
	
	static int a;
	
	int b=20;
	
	public void test() {
		
		a=10;
	}
	
	public void testA() {
		
		a=20;
		b=30;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
//		for (int i=1; i<=7;i++) {
//			
		
		
//			for (int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			
//			System.out.println();
//		}
//
//	
//	
//	
//	for (int m=1; m<=5;m++) {
//		
//		for (int n=1;n<=m;n++) {
//			
//			System.out.print(" "+"*"+" ");
//		}
//		
//		System.out.println();
//	}
		
		
		//static and instant variables
		
		System.out.println(a);
	
		ExecerciseThree  at=new ExecerciseThree();
		System.out.println(at.b);
		at.test();
		System.out.println(a);
		at.testA();
		System.out.println(a);
		System.out.println(at.b);
		

}
}
