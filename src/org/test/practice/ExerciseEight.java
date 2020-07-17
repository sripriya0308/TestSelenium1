package org.test.practice;
import java.util.LinkedHashMap;
import java.util.Map;

public class ExerciseEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//////question 1///////
		
		String a="Welcome";
		
		String b=a.replace('e', '@');
		String c=b.replace('o', '@');
		
		
		System.out.println(c);
		
		//////question 2////////////////////////
		
		
		String d="Welcome To Java class @123";
		
		int length=d.length();
		
				
		int upper=0;
		int lower=0;
		int number=0;
		int special=0;
		
		
		
			
			
		
         for (int i=0;i<length;i++) {
			
			if(Character.isUpperCase(d.charAt(i))) {
				upper++;
			}
			else if(Character.isLowerCase(d.charAt(i))) {
				lower++;
			}
			else if(Character.isDigit(d.charAt(i))){
				number++;
			}
			
			else {
				special++;
			}
	
		}
         
         System.out.println(upper+" "+lower+" "+number+" "+special);

	
	
	
	////OR//////
	
	for(int j=0;j<length;j++) {
		
		char m=d.charAt(j);
				if(m>='A' && m<='Z') {
					upper++;
				}
		
				else if(m>='a'  && m<='z') {
					
					lower++;
				}
		
				else if(m>=0 && m<=9) {
					
					number++;
				}
				else {
					
					special++;
				}
	
	}
	
	System.out.println(upper+" "+lower+" "+number+" "+special);
	
	
	
	
	
	/////////question 3///////////////
	
	
	String f="welcome";
	int len=f.length();
	
	int co=0;
	int vo=0;
	
	for(int i=0;i<len;i++) {
		
		if(f.charAt(i)=='a' || f.charAt(i)=='e' || f.charAt(i)=='i' || f.charAt(i)=='o' || f.charAt(i)=='u') {
			
			vo++;
		}
		
		else {
			
			co++;
		}
	}
	
	System.out.println(co+" "+vo);
	
		
		
	
	
	//////question 4///////////////
	
	String g="welcome to java class";
	
	String h=g.substring(0,7)	;
	
  
	System.out.println(h);
	
	
	
	//////quetsion 5///////
	
	String l="SeleniumAutomationtool";
	int stlen=l.length();
	System.out.println(stlen);
	
	String o="j a v a p r o g r a m";
	int ind=o.lastIndexOf(" ");
	System.out.println(ind);
	
	////question 6////////
	
	
	String p="velmurugan";
	char q=p.charAt(4);
	
	System.out.println(q);
	
	}
	

}
