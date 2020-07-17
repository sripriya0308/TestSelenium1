package org.file.test;

import java.io.File;

public class FileOperationsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		File f=new File("C:\\Users\\sripriya\\Documents\\Selenium\\selenium class");
		
	    boolean a=f.mkdir();
		System.out.println(a);

	}

}
