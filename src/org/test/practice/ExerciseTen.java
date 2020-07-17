package org.test.practice;
import java.io.EOFException;
import java.io.IOException;

public class ExerciseTen extends Throwable {
	////question 2/////////
	private void m1()
    {
      m2();
       System.out.println("1");
      }
  private void m2()
     {
       m3();
      System.out.println("2");
      }
private void m3()
    {
      System.out.println("3");
   try
     {
     int sum = 4/0;
     System.out.println("4");
        }
catch(ArithmeticException e)
{
    System.out.println("5");
}
 
    System.out.println("7");
     }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/////question 1/////
		 
	          try
	          {
	                System.out.println("1");
	              int sum = 9 / 0;
	                System.out.println("2");
	          }
	          catch(ArithmeticException e)
	          {
	                System.out.println("3");
	          }
	           catch(Exception e)
	          {
	                System.out.println("4");
	          }
	          finally
	          {
	             System.out.println("5");
	          }
	          
	          
	          /////question 2//////
	          
	          
               ExerciseTen et=new ExerciseTen();
              et.m1();
              
              
              
              //////question 3///////
              
              try
              {
               System.out.println("1");
                int data = 5 / 0;
              }
             catch(ArithmeticException e)
              {
             System.out.println("2");
             //System.exit(0);
               }
             finally
                {
              System.out.println("3");
                }
             System.out.println("4");
             
             
             
             //////question 4///////
             
             
             
             try
             {
            System.out.println("1");
              int data = 5 / 0;
              }
           catch(ArithmeticException e)
             {
        	   ExerciseTen et1=new ExerciseTen();
            try
             {
            throw et1;
              } 
            catch (Throwable e1) 
               {
            System.out.println("8");
               }
               
          finally
           {
          System.out.println("3");
           }
             
             }
        System.out.println("4");

        
        
        /////question 5////////
        try
        {
        System.out.println("1");
        int value = 10 / 0;
         throw new IOException();
         }
        catch(EOFException e)
           {
      System.out.println("2");
        } 
     catch(ArithmeticException e)
       {
      System.out.println("3");
         }
     catch(NullPointerException e)
      {
      System.out.println("4");
      }
     catch(IOException e)
       {
      System.out.println("5");
      }
         catch(Exception e)
     {
      System.out.printf("6");
        }
        
               
              
              
              
              
               }
	             
	         


	

}
