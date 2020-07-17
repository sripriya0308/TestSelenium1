package org.ControlStatements.test;

public class ForLoopTest {
	
	public static void main(String[] args) {
		
	
	
	for(int i=0;i<=10;i++) {
		
		System.out.println(i);
	}
	
	
	
	//nested for
	
	
	for (int i=0;i<=3;i++) {
		for(int j=0;j<3;j++) {
			System.out.println(j);
		}
		
		System.out.println(i);
	}
	
	
	//break statement	
	
	
	for (int i=0;i<=10;i++) {
		
		if(i==5) {
			break;
		}
		
		System.out.println(i);
	}
	
	System.out.println("end");
	
	//continue
	
	
   for (int i=0;i<=10;i++) {
		
		if(i==5) {
			continue;
		}
		
		System.out.println(i);
	}
	
	System.out.println("end");
	
	//while
	
			int w=25;
			
			while(w==25) {
				
				System.out.println(w);
				w++;	
				
				
				//do while
				
					
				int  m=9;
				
				do {
					
					System.out.println(m);
					m++;
					
				}while(m==9);
	
	//System.exit(0)
	
	 for (int i=0;i<=10;i++) {
			
			if(i==5) {
				System.exit(0);
			}
			
			System.out.println(i);
		}
		
		System.out.println("end");
	
		
		
		}
	
	
	

	
	

}
}
